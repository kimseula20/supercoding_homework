package com.github.supercoding_day4_homework.web.controller;

import com.github.supercoding_day4_homework.service.AirReservationService;
import com.github.supercoding_day4_homework.web.dto.airline.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/air-reservation")
public class AirReservationController {

  private AirReservationService airReservationService;

  public AirReservationController(AirReservationService airReservationService) {
    this.airReservationService = airReservationService;
  }

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

  @PostMapping("/payments")
  public String makePayments(@RequestBody PaymentsRequest paymentsRequest){
    Integer successPayments = airReservationService.makePayments(paymentsRequest);
    return "요청하신 결제 중 " + successPayments + "건 진행완료 되었습니다.";
  }
}
