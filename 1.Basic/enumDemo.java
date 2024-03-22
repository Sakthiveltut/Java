public class enumDemo {
    enum GameLevel {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {

        GameLevel a=GameLevel.HIGH;
        System.out.println(a);
 
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
 
        for (GameLevel level : GameLevel.values()) {
            System.out.println(level);
        }
 
    }
}