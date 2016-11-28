package com.sd.ch8;
//import com.sd.ch8.Rectangle;

public class Cube extends Rectangle{
    double height;
    public Cube(double l, double w, double h){
        super(l,w);
        height=h;
    }
    public double getHeight(){
        return this.height;
    }
}