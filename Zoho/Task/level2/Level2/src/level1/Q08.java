package level1;

public class Q08 {

    public static void main(String[] args) {
    	Q08 obj = new Q08();
        int[] nums = {5,2,2,3,1,4};
        System.out.println(obj.zoho(nums)); 
    }
    
    public int zoho(int[] nums) {
        Pair a = new Pair(-1, false);
        Pair b = new Pair(-1, false);
        Pair c = new Pair(-1, false);
        for (int num: nums) {
            if ((a.valid && a.value == num) || (b.valid && b.value == num) || (c.valid && c.value == num)) continue;
            if (!a.valid || a.value < num) {
                c = b;
                b = a;
                a = new Pair(num, true);
            } else if (!b.valid || b.value < num) {
                c = b;
                b = new Pair(num, true);
            } else if (!c.valid || c.value < num) {
                c = new Pair(num, true);
            }
        }
        if (!c.valid) return a.value;
        return c.value;
    }

    class Pair {
        int value;
        boolean valid;
        
        Pair(int value, boolean valid) {
            this.value = value;
            this.valid = valid;
        }
    }
    
}

