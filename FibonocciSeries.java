package LoopStatement;

public class FibonocciSeries {
    public static void main(String[] args) {
        int fN=-1,sN=1,tN=0,n=100;
        int i=0;

        do{
             tN=fN+sN;
            System.out.println(tN);
            fN=sN;
            sN=tN;
        i++;

        }while (i<=15);



    }
}
