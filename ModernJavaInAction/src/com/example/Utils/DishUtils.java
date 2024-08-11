package com.example.Utils;

import com.example.domain.Dish;

import java.util.Arrays;
import java.util.List;

public class DishUtils {

    public static List<Dish> getDishes() {
        return Arrays.asList(
            new Dish("pork",false,800, Dish.Type.MEAT)
        );
    }
}
