package com.github.supercoding_day4_homework.web.dto.airline;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationResult {
  private List<Integer> prices;
  private List<Integer> charges;
  private Integer tax;
  private Integer totalPrice;
  private Boolean success;

}

