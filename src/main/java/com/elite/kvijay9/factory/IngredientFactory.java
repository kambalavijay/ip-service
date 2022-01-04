package com.elite.kvijay9.factory;

import com.elite.kvijay9.enums.Unit;
import com.elite.kvijay9.model.CoffeePowder;
import com.elite.kvijay9.model.Ingredient;
import com.elite.kvijay9.model.Milk;
import com.elite.kvijay9.model.Sugar;
import com.elite.kvijay9.model.Water;

public class IngredientFactory {

    public static Ingredient getIngredient(Class clazz, String name, float quantity, Unit unit){
        if(clazz.equals(CoffeePowder.class)){
            return new CoffeePowder(name, quantity, unit);
        }
        else if(clazz.equals(Milk.class)){
            return new Milk(name, quantity, unit);
        }
        else if(clazz.equals(Water.class)){
            return new Water(name, quantity, unit);
        }
        else if(clazz.equals(Sugar.class)){
            return new Sugar(name, quantity, unit);
        }
        else {
            return null;
        }
    }
}
