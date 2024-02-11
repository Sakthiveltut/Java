abstract class Mobile {
    void VoiceCall() {
        System.out.println("You can Make Voice Call");
    }
    abstract void camera();
    abstract void touchDisplay();
 
}
class samsung extends Mobile
{
 
    @Override
    void camera() {
        System.out.println("16 Mega Pixel Camera");
    }
 
    @Override
    void touchDisplay() {
        System.out.println("5.5 inch Display");
    }
}
 
class Nokia extends  Mobile
{
 
    @Override
    void camera() {
        System.out.println("8 Mega Pixel Camera");
    }
 
    @Override
    void touchDisplay() {
        System.out.println("5 inch Display");
    }
 
    void fingerPrint() {
        System.out.println("Fast Finger Sensor..");
    }
}
public class abstractExample {
    public static void main(String args[]) {
 
        samsung M32 =new samsung();
        M32.VoiceCall();
        M32.touchDisplay();
        M32.camera();
        System.out.println("-------------------------");
        Nokia N1= new Nokia();
        N1.VoiceCall();
        N1.camera();
        N1.touchDisplay();
        N1.fingerPrint();
 
    }
}