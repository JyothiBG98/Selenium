package LoopStatement;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int number=123;
        int sum=(1*1*1)+(2*2*2)+(3*3*3);
        System.out.println(sum);
        if(sum==number){
            System.out.println("The given number is Armstrong Number");
        }
        else
            System.out.println("The given number is not Armstrong Number");


    }
}
