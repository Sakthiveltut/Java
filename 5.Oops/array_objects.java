class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
    void print()
    {
        System.out.println("Name    : "+name);
        System.out.println("Roll No : "+roll_no);
        System.out.println("---------------------------------");
    }
}
public class array_objects {
    public static void main (String[] args)
    {
        Student[] o;
        o = new Student[5];
        o[0] = new Student(10,"Ram");
        o[1] = new Student(20,"Sam");
        o[2] = new Student(30,"Ravi");
        o[3] = new Student(40,"Kumar");
        o[4] = new Student(50,"Sundar");
        for (int i = 0; i < o.length; i++)
            o[i].print();
    }
}