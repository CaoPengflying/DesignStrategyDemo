package com.cpf.patterns.builder;

/**
 * date 2020/7/8
 *
 * @author caopengflying
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pesi());
        return meal;
    }
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
