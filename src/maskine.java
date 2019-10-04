import java.util.Scanner;

public class maskine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("indsæt to værdier");
        float a = input.nextFloat();
        float b = input.nextFloat();

        System.out.println("plus");
        System.out.println(a+b);

        System.out.println("minus");
        System.out.println(a-b);

        System.out.println("gange");
        System.out.println(a*b);

        System.out.println("division");
        System.out.println(a/b);

        System.out.println("modelus");
        System.out.println(a%b);

        System.out.println("a^b");
        System.out.println(Math.pow(a,b));

        System.out.println("sqrt x");
        System.out.println(Math.sqrt(a));

        System.out.println("procent");
        System.out.println((a/b)*100);

        input.close();
    }
}
