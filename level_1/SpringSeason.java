package com.gla.methods.level_1;
import java.util.Scanner;
public class SpringSeason {
    public boolean check_season(int month, int day){
        if(month == 3 || month == 4 || month == 5 || month == 6){
            if(month == 3 && day == 31 || month == 5 && day == 31){
                return true;
            }
            else if(month == 3 && day >= 20 || month == 4 && 1 <= day && 31>= day || month == 5 && 1 <= day && 30>= day ||  month == 6 && day <=20){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpringSeason chk = new SpringSeason();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter Day: ");
        int day = sc.nextInt();
        System.out.println(chk.check_season(month, day));
    }
}

/*

import java.util.Scanner;
class Spring_season{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month:- ");
		int month = sc.nextInt();
		System.out.print("Enter Day:- ");
		int day = sc.nextInt(); // 20 march to 20 june

	}
}
 */