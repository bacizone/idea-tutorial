package com.epam.training;

public class MyClass {

    // create the showSum method
    private void showSum(double x, double y, int count) {
        double sum = x + y;
        for (int i = 0; i < count; i++)
            System.out.println(sum);

    }



    public void printSum(double x, double y, int count){
        showSum(x,y,count);

    }



}
