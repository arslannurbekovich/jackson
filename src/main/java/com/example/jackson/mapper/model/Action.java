package com.example.jackson.mapper.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Action {

    @JacksonXmlProperty(localName = "command", isAttribute = true)
    String command;

    @JacksonXmlProperty(localName = "description", isAttribute = true)
    String description;

    @JacksonXmlProperty(localName = "name", isAttribute = true)
    String name;

    @JacksonXmlProperty(localName = "onError", isAttribute = true)
    String onError;

    @JacksonXmlProperty(localName = "onFalse", isAttribute = true)
    String onFalse;

    @JacksonXmlProperty(localName = "onTrue", isAttribute = true)
    String onTrue;

    @JacksonXmlElementWrapper(localName = "parameters")
    @JacksonXmlProperty(localName = "parameter", isAttribute = true)
    List<Parameters> parameters;
}
