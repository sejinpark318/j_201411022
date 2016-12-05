package com.sd.ch8;

public class Rectangle2 extends Shape{
    private double width;
    private double height;
    private double area;
    private double perimeter;
    
    public Rectangle2(double w, double h){
        this.width=w;
        this.height=h;
        this.area=w*h;
        this.perimeter=2*(w+h);
    }
    
    @Override
    public double calcArea(){
        return this.area;
    }
    @Override
    public double calcPerimeter(){
        return this.perimeter;
    }
    public String toString() {
        return "Rectangle..."+super.toString();
    }
}