public class FinalVar{
    public static final int SECONDS_IN_MINUTE = 60;

    public static void main(String[] args) {
        int minutes = 5;
	//SECONDS_IN_MINUTE = 50;
        int totalSeconds = minutes * SECONDS_IN_MINUTE;

        System.out.println("There are " + SECONDS_IN_MINUTE + " seconds in a minute.");
        System.out.println("In " + minutes + " minutes, there are " + totalSeconds + " seconds.");

    }


}
