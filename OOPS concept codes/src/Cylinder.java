import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
      Cylindersccass d=new Cylindersccass();
        Scanner k=new Scanner(System.in);
        Rectangle z =new Rectangle();
        System.out.println("Enter the Radius of the Cylinder:");
        d.radius=k.nextDouble();
        System.out.println("Enter the hieght of the Cylinder:");
        d.hight=k.nextInt();
        System.out.println("LIDAREA of the Cyclinder is: "+d.lidarea());
        System.out.println("SURFACE AREA of the Cyclinder is: "+d.totalsurface());
        System.out.println("VOLUME of the Cyclinder is: "+d.volume());
        //System.out.println("LIDAREA od the Cyclinder is: "+z.areaa());
    }
}
