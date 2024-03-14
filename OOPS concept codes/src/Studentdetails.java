public class Studentdetails {
    public int studentid;
    public String Name;
    public String Course;
    public int m1,m2,m3;

    public int Total(){
        return m1+m2+m3;
    }

    public String next(){
        return Name;
    }

    public String Course(){
        return Name;
    }

    public int radix(){
        return studentid;
    }
    public double Average(){
        return (Total())/3;

    }
    public char Grade(){
        if(Total()>=160)
            return 'A';
        else if(Total()<160&&Total()>=140)
            return 'B';
        else
            return 'C';
    }
}
