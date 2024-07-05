package com.github.supercoding_day4_homework.repository.users;

import java.util.Optional;

public interface UserRepository {
  Optional<UserEntity> findUserById(Integer userId);
}
