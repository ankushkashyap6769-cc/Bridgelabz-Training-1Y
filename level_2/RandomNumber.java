package com.gla.methods.level_2;
import java.util.*;
public class RandomNumber {
    public static int random_genrator() {
        int min = 1000;
        int max = 10000;
        Random rand = new Random();
        int randNum = rand.nextInt((max - min) + 1 + min) ;
        return randNum;
    }
    static void main(String[] args) {
         int[] rand = {RandomNumber.random_genrator(), RandomNumber.random_genrator(), RandomNumber.random_genrator(), random_genrator(), random_genrator()};
         int sum=0;
         int maximum =0;
         int minimum=rand[0];
         for(int i=0;i<rand.length;i++){
            System.out.println(rand[i]);
             sum=sum+rand[i];
             if(maximum<rand[i]){
                 maximum=rand[i];
             }
             if(minimum>rand[i]){
                 minimum=rand[i];
             }
        }
        System.out.println("Average: " + sum/rand.length);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}