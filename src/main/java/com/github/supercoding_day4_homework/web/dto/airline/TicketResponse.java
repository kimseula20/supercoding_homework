package com.github.supercoding_day4_homework.web.dto.airline;

import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TicketResponse {
  @ApiModelProperty(name = "tickets", value = "tickets 들") private List<Ticket> tickets;
}
