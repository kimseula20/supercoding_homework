package com.github.supercoding_day4_homework.repository.passenger;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "passengerId")
@Builder
public class Passenger {
  private Integer passengerId;
  private Integer userId;
  private String passportNum;
}
