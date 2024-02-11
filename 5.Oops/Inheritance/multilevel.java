class GrandFather {
    public void house() {
        System.out.println("3 BHK House.");
    }
}
class father  extends GrandFather{
    public void land() {
        System.out.println("5 Arcs of Land..");
    }
}
 
class son extends father {
    public void car() {
        System.out.println("Own Audi Car..");
    }
}
 
public class multilevel {
    public static void main(String args[]) {
        son o = new son();
        o.car();
        o.house();
        o.land();
    }
}