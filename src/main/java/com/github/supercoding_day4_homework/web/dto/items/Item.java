package com.github.supercoding_day4_homework.web.dto.items;

import com.github.supercoding_day4_homework.repository.items.ItemEntity;

import java.util.Objects;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@EqualsAndHashCode
public class Item {
  private String id;
  private String name;
  private String type;
  private Integer price;
  private Spec spec;

}
