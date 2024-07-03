package com.github.supercoding_day4_homework.repository.passenger;

import com.github.supercoding_day4_homework.repository.users.UserEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "passengerId")
@Builder
@Entity
@Table(name = "passenger")
public class Passenger {
  @Id @Column(name = "passenger_id") @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer passengerId;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", unique = true, nullable = false)
  private UserEntity user;
  @Column(name = "passport_num", length = 50)
  private String passportNum;
}

