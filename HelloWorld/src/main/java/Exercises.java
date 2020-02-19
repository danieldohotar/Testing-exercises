import java.util.Scanner;

public class Exercises {


    public void printName() {
        System.out.println("Hello");
        System.out.println("Daniel");
    }

    public void printSum(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please a enter number");
        int a = s.nextInt();
        System.out.println("Please enter a seccond number");
        int b = s.nextInt();
        int c = a + b;
        System.out.println("The sum is " + c);
    }

    public void calculus(){
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + 3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public void printSum(int a , int b ){
        int c = a + b;
        System.out.println(c);
    }
    public void printDiff(int a , int b ){
        int c = a - b;
        System.out.println(c);
    }
    public void printDiv(double a, double b){
        double c = a / b;
        System.out.println(c);
    }
    public void printMulti(int a , int b ){
        int c = a * b;
        System.out.println(c);
    }

    public void avv(double a, double b, double c){
        double d = (a + b + c) / 3;
        System.out.println(d);
    }
    public void modulus(int a, int b){
        int c = a % b;
        System.out.println(c);
    }

    public double convertor(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public double meters(double inch){
        return  inch * 0.0254;
    }
}
