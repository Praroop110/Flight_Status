package org.example.flightstatus2.contoller;

import org.example.flightstatus2.entity.FlightEntity;
import org.example.flightstatus2.service.FlightService;
import org.example.flightstatus2.service.flightServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.flightstatus2.model.Flight;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class Flightcontroller {
    @Autowired
    private FlightService flightService;

    @PostMapping("/fly")
    public String addFlight(@RequestBody Flight flight) {

        return flightService.addFlight(flight);
    }

    @GetMapping("/fly")
    public List<Flight> getFlights() {

        return flightService.getFlight();
    }

    @DeleteMapping("fly/{flightID}")
    public String deleteFlight(@PathVariable long flightID) {
        if(flightService.deleteFlight(flightID)){
            return "Flight deleted";
        }
        return "Flight not found";
    }

    @PutMapping("/fly/{ID}")
    public String updateFlight(@PathVariable Long ID, @RequestBody Flight flight) {
        flightService.updateFlight(ID, flight);
        return "Flight updated";
    }


}
