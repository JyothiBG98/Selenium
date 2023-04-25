package JavaVariables;

public class LocalVariable {
    public static void main(String[] args) {
        LocalVariable l=new LocalVariable();
        l.addition(10,20);

    }
    public void addition(int a,int b){
        int c=a+b;        //c is local variable.
        System.out.println("The sum of two numbers is: "+c);
    }
}
