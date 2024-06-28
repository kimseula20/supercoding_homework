package com.github.supercoding_day4_homework.web.controller;

import com.github.supercoding_day4_homework.service.ElectronicStoreItemService;
import com.github.supercoding_day4_homework.web.dto.items.BuyOrder;
import com.github.supercoding_day4_homework.web.dto.items.Item;
import com.github.supercoding_day4_homework.web.dto.items.ItemBody;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class ElectronicStoreController {

  //spring 내장 함수 logback
//  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private ElectronicStoreItemService electronicStoreItemService;

  public ElectronicStoreController(ElectronicStoreItemService electronicStoreItemService) {
    this.electronicStoreItemService = electronicStoreItemService;
  }

  @GetMapping("/items")
  public List<Item> findAllItem(){
//    logger.info("GET /items 요청이 들어왔습니다.");
    log.info("GET /items 요청이 들어왔습니다.");
    List<Item> items = electronicStoreItemService.findAllItem();
//    logger.info("GET /items 응답 : " + items);
    log.info("GET /items 응답 : " + items);
    return items;
  }

  @PostMapping("/items")
  public String registerItem(@RequestBody ItemBody itemBody){
    Integer itemId = electronicStoreItemService.savaItem(itemBody);
    return "ID: " +  itemId;
  }

  @GetMapping("/items/{id}")
  public Item findItemByPathId(@PathVariable String id){
    return electronicStoreItemService.findItemById(id);
  }

  @GetMapping("/items-query")
  public Item findItemByQueryId(@RequestParam("id") String id){
    return electronicStoreItemService.findItemById(id);
  }

  @GetMapping("/items-queries")
  public List<Item> findItemByQueryIds(@RequestParam("id") List<String> ids){
    return electronicStoreItemService.findItemsByIds(ids);
  }

  @DeleteMapping("/items/{id}")
  public String deleteItemByPathId(@PathVariable String id){
    electronicStoreItemService.deleteItem(id);
    return "Object with id =" + id + "has been deleted";
  }

  @PutMapping("/items/{id}")
  public Item updateItem(@PathVariable String id, @RequestBody ItemBody itemBody){
    return electronicStoreItemService.updateItem(id, itemBody);
  }

  @PostMapping("/items/buy")
  public String buyItem(@RequestBody BuyOrder buyOrder){
    Integer orderItemNums = electronicStoreItemService.buyItems(buyOrder);
    return "요청하신 Item 중 " + orderItemNums + "개를 구매 하였습니다.";
  }
}
