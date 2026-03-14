package com.gla.methods.level_3;
import java.util.Random;
public class FootballHeights{
    public static int sum(int[] heights){
        int s=0;
        for(int i=0;i<heights.length;i++){
            s=s+heights[i];
        }
        return s;
    }
    public static double mean(int[] heights){
        int total=sum(heights);
        return (double)total/heights.length;
    }
    public static int shortest(int[] heights){
        int min=heights[0];
        for(int i=1;i<heights.length;i++){
            if(heights[i]<min){
                min=heights[i];
            }
        }
        return min;
    }
    public static int tallest(int[] heights){
        int max=heights[0];
        for(int i=1;i<heights.length;i++){
            if(heights[i]>max){
                max=heights[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] heights=new int[11];
        Random r=new Random();
        for(int i=0;i<heights.length;i++){
            heights[i]=150+r.nextInt(101);
        }
        for(int i=0;i<heights.length;i++){
            System.out.print(heights[i]+" ");
        }
        System.out.println();
        System.out.println("Sum: "+sum(heights));
        System.out.println("Mean: "+mean(heights));
        System.out.println("Shortest: "+shortest(heights));
        System.out.println("Tallest: "+tallest(heights));
    }
}
