package com.java12homework;

public abstract class TangilbleAsset extends Asset implements Thing{
    
    public TangilbleAsset(String name, int price, String color) {
        super(name, price);
        // TODO Auto-generated constructor stub
        this.color = color;
    }
    private String color;
    
    public String getColor() {
        return color;
    }
    @Override
    public String getWeight() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void setWeight(double Weight) {
        // TODO Auto-generated method stub
        
    }
}
