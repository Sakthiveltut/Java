package level1;

public class Q14 {

    public static void main(String[] args) {
        String s = "aTaTbTcT";
        System.out.println(zoho(s));
    }
    
    public static int zoho(String s) {
        int ans = 0;
        int j = 0;
        
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'a' && j % 2 == 0) {
                ans++;
            }
            if (s.charAt(i) == 'T') {
                j++;
            }
        }
        
        return ans;
    }
}

