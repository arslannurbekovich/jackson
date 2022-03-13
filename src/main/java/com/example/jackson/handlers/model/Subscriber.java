package com.example.jackson.handlers.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subscriber {
    private String name;
    private String phoneNumber;
    private Double balance;
    private List<Service> serviceList;
}
