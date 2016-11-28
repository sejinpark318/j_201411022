package com.sd.ch8;

public class Circle extends Point{
    double radius;
    public Circle(int xx, int yy, double r){
        super(x,y);
        x = xx;
        y = yy;
        this.radius = r;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    
}