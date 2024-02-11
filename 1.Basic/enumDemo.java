public class enumDemo {
    enum GameLevel {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        //Assign Enum Variable
        GameLevel a=GameLevel.HIGH;
        System.out.println(a);
 
        //Use Enum in Switch
        switch(a) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
 
        //Enum by loop
        for (GameLevel level : GameLevel.values()) {
            System.out.println(level);
        }
 
    }
}