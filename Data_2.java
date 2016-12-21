package com.prac.p6Data;

import java.util.ArrayList;
import ch.aplu.turtle.*;

public class Data_2{
    static Turtle t1 = new Turtle();
    
    public static ArrayList<Double[]> goTurtle(){
        ArrayList <Double[]> posArr = new ArrayList <Double[]>();
        for(int i = 0; i<4;i++){
            Double[] pos = new Double[2];
            t1.forward(100);
            t1.right(90);
            pos[0]=t1.getX();
            pos[1]=t1.getY();
            posArr.add(pos);
        }
        return posArr;
    }
    

    
    public static void main(String[] args){
        Data_2 d2 = new Data_2();
        ArrayList <Double[]> posArr = new ArrayList <Double[]>();
        posArr = d2.goTurtle();
        for(Double[] p: posArr){
            System.out.printf("[%.1f,%.1f]",p[0],p[1]);
        }
    }
}