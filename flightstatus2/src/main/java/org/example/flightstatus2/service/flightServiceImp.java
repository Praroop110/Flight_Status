package org.example.flightstatus2.service;


import org.example.flightstatus2.entity.FlightEntity;
import org.example.flightstatus2.model.Flight;
import org.example.flightstatus2.repository.FlightRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class flightServiceImp implements FlightService {

    @Autowired
    private FlightRepository flightRepository;



    @Override
    public String addFlight(Flight flight) {
        FlightEntity flightEntity = new FlightEntity();
        BeanUtils.copyProperties(flight, flightEntity);
        flightRepository.save(flightEntity);
        return "Flight added Successfully";
    }

    @Override
    public List<Flight> getFlight() {
        List<FlightEntity> flightEntities = flightRepository.findAll();
        List<Flight> flights = new ArrayList<>();
        for (FlightEntity flightEntity : flightEntities) {
            Flight flight = new Flight();
            flight.setFlightID(flightEntity.getFlightID());
            flight.setFlightName(flightEntity.getFlightName());
            flight.setFlightStatus(flightEntity.getFlightStatus());
            flight.setTime(flightEntity.getTime());
            flights.add(flight);
        }
        return flights;
    }

    @Override
    public boolean deleteFlight(Long flightID) {
        FlightEntity entity = flightRepository.findById(flightID).get();
        flightRepository.delete(entity);
        return true;
    }

    @Override
    public String updateFlight(Long id, Flight flight){
        FlightEntity existingFlight = flightRepository.findById(id).get();
        existingFlight.setFlightName(flight.getFlightName());
        existingFlight.setFlightStatus(flight.getFlightStatus());
        existingFlight.setTime(flight.getTime());
        flightRepository.save(existingFlight);
        return "update Successfully";
    }
}
