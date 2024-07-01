package com.github.supercoding_day4_homework.web.dto.airline;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TicketResponse {
  private List<Ticket> tickets;
}
