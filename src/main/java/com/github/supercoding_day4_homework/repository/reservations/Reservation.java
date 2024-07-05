package com.github.supercoding_day4_homework.repository.reservations;

import com.github.supercoding_day4_homework.repository.airlineTicket.AirlineTicket;
import com.github.supercoding_day4_homework.repository.passenger.Passenger;
import jakarta.persistence.*;
import java.util.Objects;
import lombok.*;

import java.time.LocalDateTime;
import org.hibernate.Hibernate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "reservation")
@ToString
public class Reservation {
  @Id @Column(name = "reservation_id") @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer reservationId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "passenger_id")
  @ToString.Exclude
  private Passenger passenger;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "airline_ticket_id")
  @ToString.Exclude
  private AirlineTicket airlineTicket;

  @Column(name = "reservation_status", length = 10)
  private String reservationStatus;

  @Column(name = "reserve_at")
  private LocalDateTime reserveAt;

  public Reservation(Passenger passenger, AirlineTicket airlineTicket) {
    this.passenger = passenger;
    this.airlineTicket = airlineTicket;
    this.reservationStatus = "대기";
    this.reserveAt = LocalDateTime.now();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    Reservation that = (Reservation) o;
    return reservationId != null && Objects.equals(reservationId, that.reservationId);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
