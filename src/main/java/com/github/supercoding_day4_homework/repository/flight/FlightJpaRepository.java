package com.github.supercoding_day4_homework.repository.flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightJpaRepository extends JpaRepository<Flight, Integer> {


}