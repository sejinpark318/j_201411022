package com.sd.ch8;

public class Point{
    protected int x;
    protected int y;
    public static void main(String[] args){
        Point p = new Point();
        Circle c = new Circle(10,10,5);
        double a = c.getArea();
        System.out.print("Circles Area is "+a)
    }
}