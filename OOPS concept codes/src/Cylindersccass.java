public class Cylindersccass {
    public double radius;
    public int hight;

    public double lidarea(){
        return 44/7*radius;
    }
    public double totalsurface(){
        return lidarea()*(hight+radius);
    }

    public double volume(){
        return 22/7*(radius*radius)*hight;
    }

}
