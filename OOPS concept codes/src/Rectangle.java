public class Rectangle {
    public int Length;
    public int Breadth;

    public double areaa(){
        return Length*Breadth;
    }
    public double perimeter(){
        return 2*(Length+Breadth);
    }
    public boolean isSquare(){
        return Length==Breadth;
    }
}
