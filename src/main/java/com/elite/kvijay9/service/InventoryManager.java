package com.elite.kvijay9.service;

import com.elite.kvijay9.enums.Unit;
import com.elite.kvijay9.model.CoffeePowder;
import com.elite.kvijay9.model.Milk;
import com.elite.kvijay9.model.Sugar;
import com.elite.kvijay9.model.Water;
import org.springframework.stereotype.Service;

@Service
public class InventoryManager {
    private static float milk = 2000;
    private static float water = 3000;
    private static float coffeePowder = 2000;
    private static float sugar = 2000;

    // there could be other params
    public boolean isIngredientAvailable(Class ingrClass, float quantity){
        if(ingrClass.equals(Milk.class)){
            return milk > quantity;
        }
        else if(ingrClass.equals(Water.class)){
            return water > quantity;
        }
        else if(ingrClass.equals(CoffeePowder.class)){
            return coffeePowder > quantity;
        }
        else if(ingrClass.equals(Sugar.class)){
            return sugar > quantity;
        }
        else {
            return false;
        }
    }

    public void deductQuantity(Class ingrClass, float quantity) throws Exception{
        if(isIngredientAvailable(ingrClass, quantity)){
            if(ingrClass.equals(Milk.class)){
                milk -= quantity;
            }
            else if(ingrClass.equals(Water.class)){
                water -= quantity;
            }
            else if(ingrClass.equals(CoffeePowder.class)){
                coffeePowder -= quantity;
            }
            else if(ingrClass.equals(Sugar.class)){
                sugar -= quantity;
            }
            else {
                throw new Exception("Incorrect Ingredient");
            }
        }
        else{
            throw new Exception("Sufficient " + ingrClass.getName() +" Ingredient not found in the inventory");
        }
    }
}
