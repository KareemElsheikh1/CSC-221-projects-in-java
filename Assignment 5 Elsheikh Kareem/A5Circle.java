package edu.cuny.ccny.csc221.a5;

public class A5Circle {
    private double x;
    private double y;
    private double radius;
    private String color;

    public  A5Circle(){
        x =0;
        y =0;
        radius = 0;
        color = "";
    }

    public A5Circle(double x, double y, double radius, String color){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }
    public double getX(double x) {return  x;}
    public double getY(double y) {return   y;}
    public  double getRadius(double radius){return  radius;}
    public String getColor(String color){return  color;}
}


