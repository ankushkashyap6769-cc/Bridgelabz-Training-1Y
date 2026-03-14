package com.gla.methods.level_3;
public class OTPProgram{
    public static int generateOTP(){
        return (int)(Math.random()*900000)+100000;
    }
    public static boolean unique(int[] otp){
        for(int i=0;i<otp.length;i++){
            for(int j=i+1;j<otp.length;j++){
                if(otp[i]==otp[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] otp=new int[10];
        for(int i=0;i<otp.length;i++){
            otp[i]=generateOTP();
        }
        for(int i=0;i<otp.length;i++){
            System.out.println(otp[i]);
        }
        if(unique(otp)){
            System.out.println("All OTPs are unique");
        }
        else{
            System.out.println("Duplicate OTP found");
        }
    }
}