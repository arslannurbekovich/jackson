package com.example.jackson.mapper.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Parameters {
    @JacksonXmlProperty(localName = "name", isAttribute = true)
    String name;

    @JacksonXmlText
    private String value;
}

