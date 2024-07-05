package com.github.supercoding_day4_homework.repository.users;

import com.github.supercoding_day4_homework.repository.passenger.Passenger;
import jakarta.persistence.*;
import java.util.Objects;
import lombok.*;
import org.hibernate.Hibernate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class UserEntity {
  @Id @Column(name = "user_id") @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userId;
  @Column(name = "user_name", length = 20)
  private String userName;
  @Column(name = "like_travel_place", length = 30)
  private String likeTravelPlace;
  @Column(name = "phone_num", length = 30)
  private String phoneNum;

  @OneToOne(mappedBy = "user")
  private Passenger passenger;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    UserEntity that = (UserEntity) o;
    return userId != null && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
