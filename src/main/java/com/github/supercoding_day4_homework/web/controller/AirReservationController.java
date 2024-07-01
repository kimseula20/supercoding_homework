package com.github.supercoding_day4_homework.web.controller;

import com.github.supercoding_day4_homework.service.AirReservationService;
import com.github.supercoding_day4_homework.web.dto.airline.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/air-reservation")
@RequiredArgsConstructor
public class AirReservationController {

  private final AirReservationService airReservationService;

  @GetMapping("/tickets")
  public TicketResponse findAirlineTickets(@RequestParam("user-Id") Integer userId,
      @RequestParam("airline-ticket-type") String ticketType ){
    List<Ticket> tickets = airReservationService.findUserFavoritePlaceTickets(userId, ticketType);
    return new TicketResponse(tickets);
  }
  @PostMapping("/reservations")
  public ReservationResult makeReservation(@RequestBody ReservationRequest reservationRequest){
    return airReservationService.makeReservation(reservationRequest);
  }
}
