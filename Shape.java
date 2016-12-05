package com.sd.ch8;

public abstract class Shape{
    public String name="Shape";
    public abstract double calcArea();
    public abstract double calcPerimeter();
    public String getName(){
        return this.name;
    }
    public String toString(){
        return "Shape...."+super.toString();
    }
    public static void main(String[] args){
        Rectangle2 r2 = new Rectangle2(3,4);
        Circle2 c = new Circle2(5.0);
        r2.calcArea();
        r2.calcPerimeter();
        r2.toString();
        c.calcArea();
        c.calcPerimeter();
        c.toString();
    }
}