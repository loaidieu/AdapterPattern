package AdapterPattern;

public class SquareToRoundAdapter implements ISquareToRoundAdapter{
	private SquarePeg squarePeg;
	
	public SquareToRoundAdapter(SquarePeg peg) {
		this.squarePeg = peg;
	}

	@Override
	public void insertToRoundHole(String str) {
		System.out.println("Modifying the square peg to round peg");
		squarePeg.insertIntoSquareHole(str);
	}

	@Override
	public void insertToSquareHole(String str) {
		squarePeg.insertIntoSquareHole(str);
	}
	
	
}
