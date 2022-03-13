package com.example.jackson.handlers.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContextData {
    private int numberToCompare;
    private String nameService;
    private LocalDateTime endServiceDate;
    private List<Subscriber> subscriberList;

    public ContextData(int numberToCompare, String nameService, String endServiceDate, List<Subscriber> subscriberList) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        this.numberToCompare = numberToCompare;
        this.nameService = nameService;
        this.endServiceDate = LocalDateTime.parse(endServiceDate, formatter);
        this.subscriberList = subscriberList;
    }
}
