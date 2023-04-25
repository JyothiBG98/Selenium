package LoopStatement;

public class SumOfInduviduals {
    public long sum(long n){

        long sum=0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        if(sum>9){
            n=sum;
            return sum(n);
        }
        else{
            return sum;
        }



    }
    public static void main(String[] args) {
        SumOfInduviduals s=new SumOfInduviduals();
       long su= s.sum(1234567);
       System.out.println(su);


    }
}
