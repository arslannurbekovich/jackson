package com.example.jackson.handlers;

import com.example.jackson.handlers.dao.ContextRepo;
import com.example.jackson.handlers.model.ContextData;
import com.example.jackson.handlers.model.Service;
import com.example.jackson.handlers.model.Subscriber;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CompareDates {
    public Boolean compareDates(ContextRepo contextRepo ){
        ContextData contextData = contextRepo.getContext();
        LocalDateTime dateFromContext = contextData.getEndServiceDate();
        List<LocalDateTime> dateFromSubsList = new ArrayList<>();
        List<Subscriber> subscriberList = contextRepo.getContext().getSubscriberList();
        for (Subscriber subscriber : subscriberList){
            for (Service service : subscriber.getServiceList()){
                LocalDateTime dateFromSubs = service.getEndDate();
                dateFromSubsList.add(dateFromSubs);
            }
        }

        for (LocalDateTime dateTime : dateFromSubsList){
            if (dateFromContext.isEqual(dateTime)){
                return true;
            }
        }
        return false;
    }
}
