public class Radius {

    public int Radius;
    public double area(){
        return Math.PI*(Radius*Radius);
    }
    public double peri(){
        return 2*Math.PI*(Radius*Radius);
    }
    public Double circumfernce(){
        return peri();
    }

}
