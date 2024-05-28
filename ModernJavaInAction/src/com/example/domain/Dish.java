package com.example.domain;

public class Dish {
    private final String name;

    private final boolean vegetarion;

    private final int calories;

    private final Type type;

    public Dish(String name, boolean vegetarion, int calories, Type type) {
        this.name = name;
        this.vegetarion = vegetarion;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarion() {
        return vegetarion;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarion=" + vegetarion +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }

    public enum Type {MEAT,FISH,OTHER}
}
