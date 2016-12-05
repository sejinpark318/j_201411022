package com.sd.ch8;
//import com.sd.ch8.Turtle;

public class SeaTurtle extends Turtle{
    public void swim(){
        System.out.print("A sea turtle swims with"+nLimbs+"legs");
    }
    public static void main(String[] args){
        SeaTurtle st = new SeaTurtle();
        st.swim();
    }
}