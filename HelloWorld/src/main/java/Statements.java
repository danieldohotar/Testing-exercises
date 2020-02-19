import java.util.Scanner;

public class Statements {


    public void biggestSmallest(int a, int b, int c) {

        if (a < b && a < c) {
            System.out.println(a + " Is the smallest number");
        } else if (b < a && b < c) {
            System.out.println(b + " Is the smallest number");
        } else {
            System.out.println(c + " Is the smallest number");
        }

        if (a > b && a > c) {
            System.out.println(a + " Is the biggest number");
        } else if (b > a && b > c) {
            System.out.println(b + " Is the biggest number");
        } else {
            System.out.println(c + " Is the biggest number");
        }
    }

    public void charUpper() {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a char: ");
        String a = s.nextLine();
        char b = a.toCharArray()[0];
        if (b == Character.toUpperCase(b)) {
            System.out.println("Upper");
        } else {
            System.out.println("Error message ");
        }
    }

    public void leapYear() {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number");
        int year = s.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else
            System.out.println("Not leap year");
    }

    public void compare() {

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter one word");
        String word = s.nextLine();
        System.out.println("Please enter the second word");
        String anotherWord = s.nextLine();

        if (word.equals(anotherWord)) {
            System.out.println("Great");
        } else if (word.equalsIgnoreCase(anotherWord)) {
            System.out.println("Good");
        } else if (word.length() == anotherWord.length()) {
            System.out.println("Okayish");
        } else System.out.println("Bad");

    }

    public void evenNumbers() {
        int a = 100;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void reverse() {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        do {
            System.out.print(a % 10);
            a = a / 10;
        }
        while (a > 0);
    }

    public void stars() {

        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 6 - i; j > 0; j--) {
                System.out.print("*");
            }
        }
    }

    public void fibo() {
        int i = 0;
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);

        while (i < 20) {
            int c = a + b;
            a = b;
            b = c;
            i++;
            System.out.println(c);
        }
    }

    public void CaesarCipher() {
        Scanner console = new Scanner(System.in);

        System.out.print("Your secret message: ");
        String message = console.nextLine();
        message = message.toLowerCase();

        System.out.print("Your secret key: ");
        int key = console.nextInt();

        System.out.print("Your encoded message is: ");
        encode(message, key);
    }

    public void encode(String message, int key) {
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') {
                System.out.print(" ");
            } else {
                System.out.print((char) (c + key));
            }
        }
        System.out.println();
    }


    public void sqrRoot() {
        int a;
        int[] root = {8, 13, 98, 65, 23, 32};
        for (int value : root) {
            a = value * value;
            System.out.println(a);
        }
    }

    // Find the index of the longest element in a 1D String array.
    public void strIndex() {
        String[] words = {"Andrei", "Maria", "Alexandra", "Ionela", "Marius"};

        int longest = 0;
        int longIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest) {
                longest = words[i].length();
                longIndex = i;
            }
        }
        System.out.println("Longest word is " + words[longIndex]);
    }
}
