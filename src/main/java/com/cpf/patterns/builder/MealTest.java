package com.cpf.patterns.builder;

/**
 * date 2020/7/8
 *
 * @author caopengflying
 */
public class MealTest {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareNonVegMeal();
        meal.showItems();

        Meal meal1 = mealBuilder.prepareVegMeal();
        meal1.showItems();

        StringBuilder sb = new StringBuilder();
    }
}
