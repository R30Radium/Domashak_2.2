package com.company.Classes;

import com.company.Classes.Transport;
import com.company.Intes.Engineable;
import com.company.Intes.Serve;
import com.company.Intes.Serviceable;
import com.company.Intes.Wheelable;

public class Truck extends Transport implements Serve, Wheelable, Engineable, Serviceable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем" + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
