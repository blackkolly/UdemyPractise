package com.company.practise.school;

public class Students {
    int lenght;
    int bredth;//global variable
    int[] scores;

    int AreaCompute(){// compute method
        lenght= 3000;
        bredth = 30;
        return lenght*bredth;//local variable

        //System.out.println(id);
        //System.out.println(idme);
    }static void array(){
        int[] scores = new int[]{100,70,60};
        System.out.println("first position scores is: " + scores[0]);
        System.out.println("second position scores is: " + scores[1]);
        System.out.println("Third position scores is: " + scores[2]);
        System.out.println("The size of array is : " + scores.length);
    }static double sum(double x,double y){
        return x*y;

    } static double mutiply(double x,double y) {
        double sum = sum(x ,y);
        double v = sum * 200;
        return v;
    }

    public static void main(String[] args) {
        Students myst = new Students();
        //Student array1 = new Student();
        Students.array();
        System.out.println(Students.mutiply(2,3));
        float d = (float) mutiply(20,2);
        System.out.println(d);

        System.out.println(myst.AreaCompute());
    }

}
