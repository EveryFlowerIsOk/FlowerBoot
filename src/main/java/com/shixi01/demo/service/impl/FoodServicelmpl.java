package com.shixi01.demo.service.impl;

import com.shixi01.demo.mapper.FoodMapper;
import com.shixi01.demo.po.Food;
import com.shixi01.demo.service.FoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodServicelmpl implements FoodService {
    @Resource
    private FoodMapper foodMapper;
    @Override
    public List<Food> selectFoodList() {
        return foodMapper.selectFoodList();
    }
}
