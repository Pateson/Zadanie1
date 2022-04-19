package com.company;

public class Circle {
    private double radius;
    public int lenght = 1, wight = 1;
    private String color;

    public Circle(){
        // 1-ый конструктор
        radius = 1.0;
        color = "красный";
    }
    public Circle(double r){
        radius = r;
        color = "красный";
    }
    public Circle(double r, String c){
        radius = r;
        color = c;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}

