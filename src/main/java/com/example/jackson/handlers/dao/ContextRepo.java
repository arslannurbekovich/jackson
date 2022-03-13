package com.example.jackson.handlers.dao;

import com.example.jackson.handlers.model.ContextData;
import com.example.jackson.handlers.model.Service;
import com.example.jackson.handlers.model.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class ContextRepo {

    public  ContextData getContext(){

        List<Service> serviceList = new ArrayList<>();
        //dd-MM-yyyy HH:mm
        Service service = new Service("Yandex Plus", "12-01-2022 14:00", "24-02-2022 16:30");
        Service service1 = new Service("Gamer", "01-01-2022 00:00", "28-02-2022 23:59");
        Service service2 = new Service("Yandex Plus", "24-01-2022 17:35", "07-03-2022 21:30");
        serviceList.add(service);
        serviceList.add(service1);
        serviceList.add(service2);

        List<Service> serviceList1 = new ArrayList<>();
        Service service11 = new Service("Yandex Plus", "12-01-2022 14:00", "24-02-2022 16:30");
        Service service12 = new Service("Gamer", "01-01-2022 00:00", "24-02-2022 12:00");
        serviceList1.add(service11);
        serviceList1.add(service12);

        List<Service> serviceList2 = new ArrayList<>();
        Service service21 = new Service("O!TV", "13-02-2022 18:00", "12-03-2022 18:00");
        serviceList2.add(service21);

        List<Subscriber> subscriberList = new ArrayList<>();
        Subscriber subscriber = new Subscriber("Abon 1","+996705455585",150.5,serviceList);
        Subscriber subscriber1 = new Subscriber("Abon 2","+996505457799",20.0,serviceList1);
        Subscriber subscriber2 = new Subscriber("Abon 3","+996707774477",800.45,serviceList2);
        subscriberList.add(subscriber);
        subscriberList.add(subscriber1);
        subscriberList.add(subscriber2);

        ContextData contextData = new ContextData(100,"Yandex Plus","24-02-2022 12:00", subscriberList);
        return contextData;
    }
}
