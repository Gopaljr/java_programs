package comm;

public class TrafficLightSignal {
	
	enum Trafficlight{
		RED,YELLOW,GREEN
	}

	public static void main(String[] args) {
		Trafficlight signal=Trafficlight.YELLOW;
		
		switch(signal) {
		case RED:
			System.out.println("STOP!  The Signal is RED.");
			break;
		case YELLOW:
			System.out.println("WAIT!  The Signal is YELLOW.");
			break;
		case GREEN:
			System.out.println("GO!  The Signal is GREEN.");
			break;
		}

	}

}
