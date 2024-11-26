package com.example;

import java.util.List;
// класс кошки
public class Cat extends Feline {

    Predator predator;

    public Cat(Feline feline) {

        this.predator = feline;
    }

    public String getSound() {

        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
