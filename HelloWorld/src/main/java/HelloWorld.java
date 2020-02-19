
class Dog {
    public static void bark(){
        System.out.println("I am barking");
    }
}
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Helloworld");
        Dog dog = new Dog();
        dog.bark();

        Exercises ex = new Exercises();
        ex.printName();
        ex.printSum();
        ex.printDiv(4, 6);
        ex.calculus();
        ex.printSum(2, 4);
        ex.printDiv(10,5);
        ex.printDiff(20, 10);
        ex.printMulti(20,20);
        ex.avv(10, 15, 20);
        ex.modulus(10,3);
        System.out.println(ex.convertor(250));
        System.out.println(ex.meters(100));
        Statements s = new Statements();
        s.biggestSmallest(33, 2,54);

        s.charUpper();
        s.leapYear();
        s.compare();
        s.evenNumbers();
        s.reverse();
        s.stars();
        s.fibo();
        s.sqrRoot();
        s.CaesarCipher();
        s.strIndex();
    }
}
