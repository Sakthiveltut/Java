interface Controllable {
    //void turnOn();
    //void turnOff();
	int FAN = 4;
	int BULB = 5;
    	default void check()
	{
		System.out.println("checking...");
	}
}
/*
class TV implements Controllable {
    @Override
    public void turnOn() {
        System.out.println("TV is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off");
    }
}

class Fan implements Controllable {
    @Override
    public void turnOn() {
        System.out.println("Fan is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned off");
    }
}
*/
class Device
{
	static void tools()
	{
		System.out.println("Tools");
		Controllable c = new Controllable()
		{
			public void check()
			{
				System.out.println("checking...");
			}
			
		};
		c.check();
		System.out.println(c.FAN);
		
	}
}


public class InterfaceExample{
    public static void main(String[] args) {

        /*
	Controllable tv = new TV();
        tv.turnOn();
        tv.turnOff();

        Controllable fan = new Fan();
        fan.turnOn();
        fan.turnOff();
	*/

	Device.tools();
    }
}