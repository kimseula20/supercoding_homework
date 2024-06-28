package com.github.supercoding_day4_homework.repository.users;

public interface UserRepository {
  UserEntity findUserById(Integer userId);
}
