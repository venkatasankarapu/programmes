package com.swagger.example;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Car specifics")
public class Car {

    @ApiModelProperty(notes = "Unique id of the car")
    private String id;
    @ApiModelProperty(notes = "Make of the car")
    private String make;
    @ApiModelProperty(notes = "Model of the car")
    private String model;
    @ApiModelProperty(notes = "Car manufactured year")
    private String year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
