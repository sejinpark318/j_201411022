package com.prac.p6Data;

import java.util.ArrayList;

public class Data_1{
    public void makeArray(){
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i = 0 ; i <= 1000 ; i++){
            if(i%4==0 && i%5!=0){
                num.add(i);
            }
        }
        System.out.println(num);
    }
    
    public static void main(String[] args){
        Data_1 d1 = new Data_1();
        d1.makeArray();
    }
}