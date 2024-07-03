package com.github.supercoding_day4_homework.repository.reservations;

import java.util.List;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationJpaRepository extends JpaRepository<Reservation, Integer> {


  @Query("SELECT new com.github.supercodingspring_day4_homework.repository.reservations.FlightPriceAndCharge(f.flightPrice, f.charge) " +
      "FROM Reservation r " +
      "JOIN r.passenger p " +
      "JOIN r.airlineTicket a " +
      "JOIN a.flightList f " +
      "WHERE p.user.userId = :userId ")
  List<FlightPriceAndCharge> findFlightPriceAndCharge(Integer userId);


  @Query("SELECT DISTINCT f.arrivalLocation " +
      "FROM Reservation r " +
      "JOIN r.passenger p " +
      "JOIN r.airlineTicket a " +
      "JOIN a.flightList f " +
      "WHERE p.user.userName = :username ")
  Set<String> findArrivalLocation(String username);
}
