class user { //Base
    String name;
    int age;
    user(String n, int a) {
        this.name = n;
        this.age = a;
    }
    public void display(){
        System.out.println("Name  : "+name);
        System.out.println("Age   : "+age);
    }
 
}
class MainProgrammer extends user{ //Derived Class
    String CompanyName;
    MainProgrammer(String n, int a,String c){
        super(n,a);
        this.CompanyName=c;
    }
    public void display(){
        System.out.println("Name  : "+name);
        System.out.println("Age   : "+age);
        System.out.println("Company Name : "+CompanyName);
    }
 
}
public class methodOverriding {
    public static void main(String args[]) {
        MainProgrammer o =new MainProgrammer("Raja",22,"Tutor Joes");
        o.display();
    }
}
 