package com.github.supercoding_day4_homework.repository.users;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "userId")
@Builder
public class UserEntity {
  private Integer userId;
  private String userName;
  private String likeTravelPlace;
  private String phoneNum;

}
