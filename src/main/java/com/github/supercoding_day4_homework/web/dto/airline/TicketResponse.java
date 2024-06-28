package com.github.supercoding_day4_homework.web.dto.airline;

import java.util.List;

public class TicketResponse {
  private List<Ticket> tickets;

  public TicketResponse(List<Ticket> tickets) {
    this.tickets = tickets;
  }

  public TicketResponse() {
  }

  public List<Ticket> getTickets() {
    return tickets;
  }
}
