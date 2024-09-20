package org.example.flightstatus2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Flights")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightEntity {

    @Id
    private long flightID;
    private String flightName;
    private String flightStatus;
    private String time;
}