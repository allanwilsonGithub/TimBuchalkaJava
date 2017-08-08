package com.allanwilson;

/**
 * Created by awil on 2017-08-09. Starting course again after summer
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel (String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
