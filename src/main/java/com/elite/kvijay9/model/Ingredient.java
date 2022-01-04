package com.elite.kvijay9.model;

import com.elite.kvijay9.enums.Unit;

public abstract class Ingredient {
    private String name;
    private float quantity;
    private Unit units;

    public Ingredient(String name, float quantity, Unit units) {
        this.name = name;
        this.quantity = quantity;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Unit getUnits() {
        return units;
    }

    public void setUnits(Unit units) {
        this.units = units;
    }
}
