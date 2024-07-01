package com.github.supercoding_day4_homework.repository.airlineTicket;

import java.sql.Date;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "ticketId")
@ToString
@NoArgsConstructor
public class AirlineTicket {
  private Integer ticketId;
  private String ticketType;
  private String departureLocation;
  private String arrivalLocation;
  private LocalDateTime departureAt;
  private LocalDateTime returnAt;
  private Double tax;
  private Double totalPrice;

  @Builder
  public AirlineTicket(Integer ticketId, String ticketType, String departureLocation, String arrivalLocation, Date departureAt, Date returnAt, Double tax, Double totalPrice) {
    this.ticketId = ticketId;
    this.ticketType = ticketType;
    this.departureLocation = departureLocation;
    this.arrivalLocation = arrivalLocation;
    this.departureAt = departureAt.toLocalDate().atStartOfDay();
    this.returnAt = returnAt.toLocalDate().atStartOfDay();
    this.tax = tax;
    this.totalPrice = totalPrice;
  }
}
