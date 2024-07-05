package com.github.supercoding_day4_homework.web.dto.items;

import com.github.supercoding_day4_homework.repository.storeSales.StoreSales;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StoreInfo {
  private Integer id;
  private String storeName;
  private Integer amount;
  private List<String> itemNames;

  public StoreInfo(StoreSales storeSales) {
    this.id = storeSales.getId();
    this.storeName = storeSales.getStoreName();
    this.amount = storeSales.getAmount();
    this.itemNames = storeSales.getItemEntities().stream().map(ItemEntity::getName).collect(
        Collectors.toList());
  }
}
