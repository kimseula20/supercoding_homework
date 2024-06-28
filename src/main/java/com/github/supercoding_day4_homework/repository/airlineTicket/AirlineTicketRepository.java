package com.github.supercoding_day4_homework.repository.airlineTicket;

import java.util.List;

public interface AirlineTicketRepository {
  List<AirlineTicket> findAllAirlineTicketsWithPlaceAndTicketType(String likePlace, String ticketType);

  List<AirlineTicketAndFlightInfo> findAllAirLineTicketAndFlightInfo(Integer airlineTicketId);
}
