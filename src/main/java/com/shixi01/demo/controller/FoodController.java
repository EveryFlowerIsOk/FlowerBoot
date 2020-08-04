package com.shixi01.demo.controller;

import com.shixi01.demo.po.Food;
import com.shixi01.demo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @RequestMapping("/list")
    public  List<Food> getFoodList(){
        return foodService.selectFoodList();
    }
}
