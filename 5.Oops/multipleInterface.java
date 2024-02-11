class Phone
{
    void voiceCall()
    {
        System.out.println("Make VoiceClass");
    }
    void sms()
    {
        System.out.println("We Can send SMS");
    }
}
interface Camera
{
    void click();
    void record();
}
 
interface player
{
    void play();
    void pause();
    void stop();
}
 
class SmartPhone extends Phone implements Camera,player
{
 
    @Override
    public void click() {
        System.out.println("Take a Selfi");
    }
 
    @Override
    public void record() {
        System.out.println("Take a video");
    }
 
    @Override
    public void play() {
        System.out.println("Play Music");
    }
 
    @Override
    public void pause() {
        System.out.println("Pause Music");
    }
 
    @Override
    public void stop() {
        System.out.println("Stop Music");
    }
}
 
public class multipleInterface {
    public static void main(String[] args) {
        SmartPhone o =new SmartPhone();
        o.voiceCall();
        o.sms();
        o.click();
        o.record();
        o.play();
        o.pause();
        o.stop();
    }
}