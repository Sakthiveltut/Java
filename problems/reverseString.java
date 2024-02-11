public class reverseString {
    public static void main(String args[])
    {
        //Program to reverse a given string
        StringBuilder a = new StringBuilder("Tutor Joes Computer Education");
        System.out.println(a);
        StringBuilder b=new StringBuilder();
        for(int i=a.length()-1;i>=0;i--)
        {
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}