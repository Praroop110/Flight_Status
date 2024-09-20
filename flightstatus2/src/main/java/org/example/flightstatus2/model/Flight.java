package org.example.flightstatus2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor

public class Flight {

    private long flightID;
    private String flightName;
    private String flightStatus;
    private String time;



}
