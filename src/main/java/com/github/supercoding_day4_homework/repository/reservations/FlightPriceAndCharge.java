package com.github.supercoding_day4_homework.repository.reservations;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FlightPriceAndCharge {
  private Double flightPrice;
  private Double charge;
}
