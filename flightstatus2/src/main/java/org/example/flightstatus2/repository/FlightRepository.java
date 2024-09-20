package org.example.flightstatus2.repository;

import org.example.flightstatus2.entity.FlightEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends MongoRepository<FlightEntity, Long> {

}
