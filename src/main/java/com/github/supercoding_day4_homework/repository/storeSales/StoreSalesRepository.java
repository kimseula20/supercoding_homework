package com.github.supercoding_day4_homework.repository.storeSales;

import java.util.Optional;
public interface StoreSalesRepository {
  Optional<StoreSales> findStoreSalesById(Integer storeId);

  void updateSalesAmount(Integer storeId, Integer stock);
}
