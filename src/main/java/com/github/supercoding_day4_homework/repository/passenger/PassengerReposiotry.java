package com.github.supercoding_day4_homework.repository.passenger;


import java.util.Optional;

public interface PassengerReposiotry {
  Optional<Passenger> findPassengerByUserId(Integer userId);
}
