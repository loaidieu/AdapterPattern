package AdapterPattern;

public class RoundPeg implements IRoundPeg{
	//This is the adaptee class
	public void insertIntoRoundHole(String str) {
		System.out.println("RoudPeg insertIntoRoundHole(): " + str);
	}
}
