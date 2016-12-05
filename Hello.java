package com.sd.ch8;

public class Hello{
    private String name;
    public Hello(String name){
        this.name=name;
    }
    public void sayHello(){
        System.out.println("Hello "+name);
    }
    public static void main(String[] args){
        Hello[] h = new Hello[5];
        h[0] = new Hello("psj1");
        h[1] = new Hello("psj2");
        h[2] = new Hello("psj3");
        h[3] = new Hello("psj4");
        h[4] = new Hello("psj5");
        for(Hello e:h)
            e.sayHello();
    }
}