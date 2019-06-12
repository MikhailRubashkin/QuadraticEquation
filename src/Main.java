import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите а: ");
        double  a = scanner.nextDouble();
        System.out.println("Ведите b: ");
        double  b = scanner.nextDouble();
        System.out.println("Ведите c: ");
        double  c = scanner.nextDouble();
        double x;
        System.out.println("Дискрименант равен: " +discriminant(a,b,c));
        if (isPositive(discriminant(a,b,c))){
            x = (-1*b + Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("Первый корень равен: " +x);
            x = (-1*b - Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("Второй корень равен: " +x);

        }else if (isZero(discriminant(a,b,c))){
            x = (-1*b + Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("Единственный корень равен: " +x);
        }else
            System.out.println("Корни не вещественные." );

    }

     static double discriminant ( double a, double b, double c){
         return Math.pow(b, 2) - (4*a*c);

    }
    static boolean isZero(double discriminant){
        return (discriminant == 0);
    }
    static boolean isPositive (double discriminant){
        return (discriminant>0);
    }


}
