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
        System.out.println((a+b));
    }
    public void multiply() {
        System.out.println((a*b));
    }
    public void subtract() {
        System.out.println((a-b));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print();
        int a = stdin.nextInt();
        System.out.print();
        int b = stdin.nextInt();

        Calculator calc = new KDG_Calculator(a, b);
        calc.add();
        calc.multiply();
        calc.subtract();
    }
}
