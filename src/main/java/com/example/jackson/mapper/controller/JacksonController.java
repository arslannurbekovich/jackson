package com.example.jackson.mapper.controller;

import com.example.jackson.mapper.model.Action;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
public class JacksonController {

    @GetMapping(value = "/actions" , produces = {"application/json"})    //
    Action actionStation() throws XMLStreamException, IOException{
        InputStream xmlResource = JacksonController.class.getClassLoader()
                .getResourceAsStream("flow.xml");
        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(xmlResource);

        XmlMapper xmlMapper = new XmlMapper();
        Action poppy = xmlMapper.readValue(xmlStreamReader, Action.class);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(poppy);
        System.out.println(json);

        return poppy;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @GetMapping(value = "/get" )
    public List<String> getHandlerList(){
        List<Class<?>> list = getAllClassesFrom("com.example.jackson.mapper.model");
        List<String> actionList = new ArrayList<>();
        list.forEach(x -> actionList.add(x.getSimpleName()));
        return actionList;
    }

    public List<Class<?>> getAllClassesFrom(String packageName) {
        return new Reflections(packageName, new SubTypesScanner(false))
                .getAllTypes()
                .stream()
                .map(name -> {
                    try {
                        return Class.forName(name);
                    } catch (ClassNotFoundException e) {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
