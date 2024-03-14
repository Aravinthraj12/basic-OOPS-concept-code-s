import java.util.Scanner;

public class Reactclass{
    public static void main(String[] args) {
       Rectangle z=new Rectangle();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length:");
        z.Length=s.nextInt();
        System.out.println("Enter the Breadth:");
        z.Breadth=s.nextInt();
        System.out.println("Area of Reactangle is : "+z.areaa());
        System.out.println("Perimeter of Reactangle is : "+z.perimeter());
        System.out.println("Is it is Square : "+z.isSquare());
    }
}
