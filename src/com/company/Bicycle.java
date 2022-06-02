package com.company;

public class Bicycle extends Transport implements Serve {

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