package com.github.supercoding_day4_homework.web.dto.items;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Spec {
  @ApiModelProperty(name = "cpu", value = "Item CPU", example = "Google Tensor") private String cpu;
  @ApiModelProperty(name = "capacity", value = "Item 용량 Spec", example = "25G") private String capacity;
}