package by.it.narushevich.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        step1();
        step2();
        step3();
    }

    private static void step1() {
        double a = 756.13;
        double x = 0.3;
        double part1 = cos(pow((pow(x, 2.0) + PI / 6), 5.0));
        double part2 = sqrt(x * pow(a, 3.0));
        double part3 = log(abs((a - 1.12 * x) / 4));
        double z1 = part1 - part2 - part3;

        System.out.println("z1 = " + z1);
        double z2 = cos(pow((pow(x, 2.0) + PI / 6), 5.0))
                - sqrt(x * pow(a, 3.0))
                - log(abs((a - 1.12 * x) / 4));
        System.out.println("z2 = " + z2 + "\n");
    }

    private static void step2() {
        double a = 1.21;
        double b = 0.371;
        double y = tan(pow(a + b, 2.0)) - cbrt(a + 1.5) + a * pow(b, 5.0) - b / log(pow(a, 2.0));
        System.out.println("y = " + y + "\n");
    }

    private static void step3() {
        double x = 12.1;
        for (double a = -5; a <= 12; a += 3.75) {
            double f = exp(a * x) - 3.45 * a;
            System.out.printf("for a = %-5.2f f = %-10.4e", a, f);
            System.out.println();
        }
    }
}
