import java.util.Scanner;
class Wrapperclass{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = 10;
        Integer b = a;//Autoboxing
        Integer c = 10;//unboxing
        int d = c;
        System.out.println("the value of a is variable:"+a);
        System.out.println("the value of b is Wrapper class:"+b);
        System.out.println("the value of c is Wrapper class:"+c);
        System.out.println("the value of d is variable:"+d);

    }
}

class Wrapperclass2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String a = "10";
        int b = Integer.parseInt(a);
        System.out.println("the value of a is string:"+a);
        System.out.println("the value of b is variable:"+b);
        System.out.println(a+b);
    }
}