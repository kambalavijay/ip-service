package com.elite.kvijay9.model;

import com.elite.kvijay9.enums.Unit;
import com.elite.kvijay9.factory.IngredientFactory;
import java.util.List;

public class Capuccino extends Recipe{
    private static Ingredient coffeePowder;
    private static Ingredient milk;
    private static Ingredient water;
    private static Ingredient sugar;
    
    static {
        coffeePowder = IngredientFactory.getIngredient(CoffeePowder.class, "SBS", 15, Unit.GRAM);
        milk = IngredientFactory.getIngredient(Milk.class, "BestMilk", 20, Unit.ML);
        water = IngredientFactory.getIngredient(Water.class, "Kinely", 30, Unit.ML);
        sugar = IngredientFactory.getIngredient(Sugar.class, "Brown", 5, Unit.GRAM);
    }

    public Capuccino() {
        super("capuccino", List.of(coffeePowder, milk, water, sugar));
    }
}
