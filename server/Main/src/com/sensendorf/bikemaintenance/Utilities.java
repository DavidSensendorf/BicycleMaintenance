package com.sensendorf.bikemaintenance;

import java.time.LocalDate;

public class Utilities {

    public static int metersToMiles(int distanceInMeters) {
        return (int)Math.round((double)distanceInMeters * 0.00062137119224);
    }

    public static int milesToMeters(int distanceInMiles) {
        return (int)Math.round((double)distanceInMiles * 1609.344 );
    }

    public static int metersToKilometers(int distanceInMeters){
        return (int)(Math.round((double)distanceInMeters/ 1000));
    }

    public static int datesToDays(LocalDate firstDate, LocalDate secondDate) {

        return (int)firstDate.datesUntil(secondDate).count();
    }


}
