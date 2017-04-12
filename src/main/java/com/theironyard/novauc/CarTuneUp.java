package com.theironyard.novauc;

/**
 * Created by ANVIL_OCTOPUS on 4/9/17.
 */



public class CarTuneUp extends ReadWriteJson{
    public String name;
    public String mechanic;
    public String cost;
    public String manufacturer;
    public String phoneNumber;

    public CarTuneUp(){

    }




    public CarTuneUp(String name, String mechanic, String cost, String manufacturer, String phoneNumber) {
        this.name = name;
        this.mechanic = mechanic;
        this.cost = cost;
        this.manufacturer = manufacturer;
        this.phoneNumber = phoneNumber;




    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMechanic() {
        return mechanic;
    }

    public void setMechanic(String mechanic) {
        this.mechanic = mechanic;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    {


    }


}