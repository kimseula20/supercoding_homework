package com.github.supercoding_day4_homework.repository.storeSales;

public interface StoreSalesRepository {
  StoreSales findStoreSalesById(Integer storeId);

  void updateSalesAmount(Integer storeId, Integer stock);
}
