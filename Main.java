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
        System.out.println("덧셈: " + (a+b));
    }
    public void multiply() {
        System.out.println("곱셈: " + (a*b));
    }
    public void subtract() {
        System.out.println("뺄셈: " + (a-b));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력: ");
        int a = stdin.nextInt();
        System.out.print("두 번째 숫자 입력: ");
        int b = stdin.nextInt();

        Calculator calc = new KDG_Calculator(a, b);
        calc.add();
        calc.multiply();
        calc.subtract();
    }
}