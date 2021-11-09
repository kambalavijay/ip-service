package com.elite.kvijay9.factory;

import com.elite.kvijay9.enums.Unit;
import com.elite.kvijay9.model.Capuccino;
import com.elite.kvijay9.model.Expresso;
import com.elite.kvijay9.model.Recipe;

public class RecipeFactory {

    public static Recipe getRecipe(Class recipeCls, String name, float quantity, Unit unit){

        if(recipeCls.equals(Capuccino.class)){
            return new Capuccino();
        }
        else if(recipeCls.equals(Expresso.class)){
            return new Expresso();
        }
        else {
            return null;
        }
    }
}
