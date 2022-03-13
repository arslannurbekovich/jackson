//package com.example.jackson.mapper;
//
//import com.example.jackson.mapper.model.action;
//import com.fasterxml.jackson.dataformat.xml.XmlMapper;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//public class XMLMapper {
//
//    public static void deserializeFromXML() {
//        try {
//            XmlMapper xmlMapper = new XmlMapper();
//            String readContent = new String(Files.readAllBytes(Paths.get("com/example/jackson/mapper/flow.xml")));
//            action deserializedData = xmlMapper.readValue(readContent, action.class);
//            String str = deserializedData.getCommand();
//            System.out.println(str);
//        } catch (IOException e) {
//            System.out.println("error mapping xml file" + e);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Deserializing from XML...");
//        deserializeFromXML();
//    }
//}
