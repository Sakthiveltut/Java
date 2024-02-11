public class countCharacter {
    public static void main(String args[])
    {
        StringBuilder a = new StringBuilder("Ram-age is 12@");
        System.out.println(a);
        int upper = 0, lower = 0, space = 0, number = 0, vowels = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                lower++;
            }
            if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                upper++;
            }
            if (a.charAt(i) == 32) {
                space++;
            }
            if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
                number++;
            }
            if (a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' ||
                    a.charAt(i) == 'U' || a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' ||
                    a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                vowels++;
            }
        }
        System.out.println("Uppercase   : "+upper);
        System.out.println("Lowercase   : "+lower);
        System.out.println("Space       : "+space);
        System.out.println("Number      : "+number);
        System.out.println("Vowels      : "+vowels);
        System.out.println("Symbols      : "+(a.length()-(upper+lower+space+number)));
        // System.out.println(a.charAt(1));
        // System.out.println('a'==97);
    }
}