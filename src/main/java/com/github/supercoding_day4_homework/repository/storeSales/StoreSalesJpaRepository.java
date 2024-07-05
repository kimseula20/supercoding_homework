package com.github.supercoding_day4_homework.repository.storeSales;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreSalesJpaRepository extends JpaRepository<StoreSales, Integer> {

  @Query("SELECT s FROM StoreSales s JOIN FETCH s.itemEntities")
  List<StoreSales> findAllFetchJoin();
}
