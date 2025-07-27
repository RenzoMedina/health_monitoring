package com.ejemplo;

public class User {

    private String name;
    private double weight;

    public User(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }

    public void updateWeight(double newWeight) {
        this.weight = newWeight;
    }

    public void viewInformation(){
        System.out.println("User:" + name + "Current weight: " + weight);
    }
}
