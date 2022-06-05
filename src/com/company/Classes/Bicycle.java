package com.company.Classes;

import com.company.Intes.Serve;
import com.company.Intes.Serviceable;
import com.company.Intes.Wheelable;

public class Bicycle extends Transport implements Serve, Wheelable, Serviceable {

    public Bicycle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check(){
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

}