package com.sd.ch8;

public class Turtle{
    public int nLimbs = 4;
    protected String food=null;
    
    public void setFood(String f){
        this.food = f;
    }
    public void eat(){
        System.out.println("Turtle eats "+food);
    }
    public static void main(String[] args){
        Turtle t = new Turtle();
        t.setFood("seaweed");
        t.eat();
    }
}