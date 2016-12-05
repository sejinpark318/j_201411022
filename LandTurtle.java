package com.sd.ch8;
//import com.sd.ch8.Turtle;

public class LandTurtle extends Turtle{
    public void walk(){
        System.out.print("A Land turtle walks with"+nLimbs+ "legs");
    }
    public static void main(String[] args){
        LandTurtle lt = new LandTurtle();
        lt.walk();
    }
}