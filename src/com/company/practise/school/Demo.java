package com.company.practise.school;

import java.util.ArrayList;

public class Demo {
    int age;
    String name ;
    String gender;
    Boolean intern = true;
    double internFees = 5000;
    double localFees = 10000;
    void compute(){
        System.out.println("degree :");
        if(intern == true){
            System.out.println(internFees);

        }
            System.out.println(age);
            System.out.println(name);
            System.out.println(gender);
    }
    public static void main(String[] args) {
        ArrayList mt = new ArrayList();

        Demo me = new Demo();
        me.name ="Kola";
        me.age = 14;
        me.gender = "male";
        me.compute();

    }
}
