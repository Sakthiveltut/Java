public class Student{
 public static String college = "Pope";
 public String dept = "CSE";
 public static void main(String[] args) {
  
  Student mosesh = new Student();
  mosesh.dept = "ECE";
  System.out.println(mosesh.college);
  System.out.println(mosesh.dept);
  
  Student sakthi = new Student();
  sakthi.college = "grace";
  System.out.println(sakthi.college);
  System.out.println(sakthi.dept);
  
  Student rahul = new Student();
  System.out.println(rahul.college);
  System.out.println(rahul.dept);
 }
}
