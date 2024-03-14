import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Radius r=new Radius();// circle
        Scanner sc=new Scanner(System.in);
        r.Radius=sc.nextInt();
        System.out.println("Area= "+r.area());
        System.out.println("Perimeter= "+r.peri());
        System.out.println("Circumfernce= "+r.circumfernce());


    }
}