public class Relationallogicbitwise{
    public static void main(String[] args) {
        int num1=30;
        int num2=60;
        System.out.println(num1);
        System.out.println(num1==num2);
        System.out.println(num1>num2);
        System.out.println(num1>=num2);
        System.out.println(num1<num2);
        System.out.println(num1<=num2);
        System.out.println(num1!=num2);

        // logical operators
        boolean a=true;
        boolean b=false;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!a);
        System.out.println(!b);

        //bitwise operators
        int c=100;
        int d=200;
        System.out.println(c&d);
        System.out.println(c|d);
       // System.out.println(c!d);
       // System.out.println(c^d);
        //System.out.println(c~d);
       // System.out.println(c<<);
        //System.out.println(c>>);
    }
}