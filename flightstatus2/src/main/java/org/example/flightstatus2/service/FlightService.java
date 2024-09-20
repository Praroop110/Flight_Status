
package org.example.flightstatus2.service;
import java.util.List;

import org.example.flightstatus2.entity.FlightEntity;
import org.example.flightstatus2.model.Flight;

public interface FlightService {
    String addFlight(Flight flight);
    List<Flight> getFlight();
    boolean deleteFlight(Long flightId);
    String updateFlight(Long id, Flight flight);
}