package com.test.jdatest.availability;

import com.test.jdatest.availability.Availability;
import com.test.jdatest.inventory.Supply;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

@Component
public class ProdAvailabilityService {

    private static List<Availability> availability = new ArrayList<>();
    private static List<Capacity> capacity = new ArrayList<>();

    static {
        availability.add(new Availability("Store001","Prod1", 1.0, new Date(2021 - 02 - 19)));
        availability.add(new Availability("Store001","Prod1",3.0 ,new Date(2021 - 02 - 19)));
        availability.add(new Availability("Store001","Prod1", 0, new Date(2021 - 02 - 19)));
    }

    static {
        capacity.add(new Capacity("Store001","Prod1", 1.0, new Date(2021 - 02 - 19)));
        capacity.add(new Capacity("Store001","Prod1",3.0 ,new Date(2021 - 02 - 19)));
        capacity.add(new Capacity("Store001","Prod1", 0, new Date(2021 - 02 - 19)));
    }

    double getAvailability(java.util.Date reqdate){
        Predicate<? super Availability> predicate = aval -> aval.getDate().equals(reqdate);
        return availability.stream().filter(predicate).findFirst().orElse(null).getAvailQty();

    }

    double getCapacity(java.util.Date reqdate){
        Predicate<? super Capacity> predicate = cap -> cap.getDate().equals(reqdate);
        return capacity.stream().filter(predicate).findFirst().orElse(null).getNoOfOrdersAccepted();

    }
}
