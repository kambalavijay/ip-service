package com.elite.kvijay9;

import java.lang.reflect.Field;

public class RefelctionExample {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        CustomJModel dialog = new CustomJModel();
        dialog.setVisibility(false); // this is resulting erro in the flow right?

        // follow the alternate
        Class<?> clazz = Class.forName("com.example.demo.CustomJModel");
        Field f1 = clazz.getDeclaredField("visibility");
        f1.setAccessible(true);
        f1.set(dialog, true);
        System.out.println(dialog);
    }
}

class CustomJModel {

    private boolean visibility;

    public CustomJModel(){

    }

    public void setVisibility(boolean visibility) {
        // set extra behaviour
        this.visibility = visibility;
        // set some more extra behaviour
    }

    @Override
    public String toString() {
        return "CustomJModel{" +
                "visibility=" + visibility +
                '}';
    }
}