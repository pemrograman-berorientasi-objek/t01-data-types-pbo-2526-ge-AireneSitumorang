import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String soal = sc.next();

        if (soal.equals("Soal1")) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ((b > 0 && a > Integer.MAX_VALUE - b) ||
                (b < 0 && a < Integer.MIN_VALUE - b)) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(a + b);
            }
        }

        else if (soal.equals("Soal2")) {
            float x = sc.nextFloat();
            float y = sc.nextFloat();

            float floatSum = x + y;
            double doubleSum = (double) x + (double) y;

            System.out.printf("%.6f%n", Math.abs(floatSum - doubleSum));
        }

        else if (soal.equals("Soal3")) {
            int N = sc.nextInt();

            Integer a = N;
            Integer b = a;

            a += 1;  // sama dengan a = a + 1

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        else if (soal.equals("Soal4")) {
            String S = sc.next();

            String a = S;
            String b = new String(S);

            a += "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        else if (soal.equals("Soal5")) {
            int i     = sc.nextInt();
            double d  = sc.nextDouble();
            boolean flag = sc.nextBoolean();

            double result = i * d;
            if (!flag) result = -result;

            System.out.printf("%.2f%n", result);
        }

        sc.close();
    }
}