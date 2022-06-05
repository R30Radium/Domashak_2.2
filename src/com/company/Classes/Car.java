package com.company.Classes;

import com.company.Intes.Engineable;
import com.company.Intes.Serviceable;
import com.company.Intes.Wheelable;

public class Car extends Transport implements Serviceable, Wheelable, Engineable {

    public Car(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
       checkEngine();
    }
}