package com.shixi01.demo.mapper;

import com.shixi01.demo.po.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface FoodMapper {
    List<Food> selectFoodList();
}
