import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Studentdetails t=new Studentdetails();
        Scanner se=new Scanner(System.in);
        System.out.println("Enter the Student Id:");
        t.studentid=se.nextInt();
        System.out.println("Enter the Student Name:");
        t.Name=se.next();
        System.out.println("Enter the Course:");
        t.Course=se.next();
        System.out.println("Enter the 1st CIA mark:");
        t.m1= se.nextInt();
        System.out.println("Enter the 2nd CIA mark:");
        t.m2= se.nextInt();
        System.out.println("Enter the 3rd CIA mark:");
        t.m3= se.nextInt();
        System.out.println("The Student Name is: "+t.next());
        System.out.println("The Student Id is: "+t.radix());
        System.out.println("The Student's Total mark he Scored: "+t.Total());
        System.out.println("The Average Mark he Sored: "+t.Average());
        System.out.println("The Grade he Scored: "+t.Grade());
    }
}
