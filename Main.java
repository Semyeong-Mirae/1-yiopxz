import java.util.Scanner;

interface Calculator {
    void add();
    void multiply();
    void subtract();
}

class KDG_Calculator implements Calculator {
    private int a;
    private int b;

    public KDG_Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        System.out.println("Addition: " + (a + b));
    }

    public void multiply() {
        System.out.println("Multiplication: " + (a * b));
    }

    public void subtract() {
        System.out.println("Subtraction: " + (a - b));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = stdin.nextInt();

        System.out.print("Enter second number: ");
        int b = stdin.nextInt();

        Calculator calc = new KDG_Calculator(a, b);
        calc.add();
        calc.multiply();
        calc.subtract();

        stdin.close();
    }
}
