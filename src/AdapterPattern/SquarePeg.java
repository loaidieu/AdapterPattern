package AdapterPattern;

public class SquarePeg implements ISquarePeg{
	public void insertIntoSquareHole(String str) {
		//this is adapter class - the class need to implement the adapter to call squareToRoundHole
		System.out.println("SquarePeg insertIntoSquareHole(): " + str);
	}
}
