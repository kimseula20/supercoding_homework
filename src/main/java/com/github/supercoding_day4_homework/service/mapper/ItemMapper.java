package com.github.supercoding_day4_homework.service.mapper;

import com.github.supercoding_day4_homework.repository.items.ItemEntity;
import com.github.supercoding_day4_homework.web.dto.items.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ItemMapper {

  ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

  @Mapping(target = "spec.cpu", source = "cpu")
  @Mapping(target = "spec.capacity", source = "capacity")
  Item itemEntityToItem(ItemEntity itemEntity);

}
