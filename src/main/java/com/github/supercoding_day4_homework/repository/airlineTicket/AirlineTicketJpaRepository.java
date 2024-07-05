package com.github.supercoding_day4_homework.repository.airlineTicket;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineTicketJpaRepository extends JpaRepository<AirlineTicket, Integer> {

  List<AirlineTicket> findAirlineTicketsByArrivalLocationAndTicketType(String likePlace, String ticketType);
}
