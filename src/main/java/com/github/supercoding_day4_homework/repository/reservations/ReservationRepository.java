package com.github.supercoding_day4_homework.repository.reservations;

public interface ReservationRepository {
  Boolean saveReservation(Reservation reservation);

  Reservation findReservationWithPassengerIdAndAirLineTicketId(Integer userId, Integer airlineTicketId);

  void updateReservationStatus(Integer reservationId, String status);
}
