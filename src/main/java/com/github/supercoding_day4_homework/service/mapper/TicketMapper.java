package com.github.supercoding_day4_homework.service.mapper;

import com.github.supercoding_day4_homework.repository.airlineTicket.AirlineTicket;
import com.github.supercoding_day4_homework.web.dto.airline.Ticket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TicketMapper {

  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
  TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);

  @Mapping(target = "depart", source = "departureLocation")
  @Mapping(target = "arrival", source = "arrivalLocation")
  @Mapping(target = "departureTime", source = "departureAt", qualifiedByName = "convert")
  @Mapping(target = "returnTime", source = "returnAt", qualifiedByName = "convert")
  Ticket airlineTicketToTicket(AirlineTicket airlineTicket);

  @Named("convert")
  static String localDateTimeToString(LocalDateTime localDateTime) {
    return localDateTime.format(formatter);
  }
}
