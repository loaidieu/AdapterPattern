package AdapterPattern;

public class Driver {

	public static void main(String[] args) {
		// This is the target class
		p.p("creating the square peg");
		SquarePeg sp = new SquarePeg();
		p.p("square peg to square hole");
		sp.insertIntoSquareHole("");
		
		p.p("try insert square peg to round hole");
		SquareToRoundAdapter  adapter = new SquareToRoundAdapter(sp);
		p.p("testing adapter");
		adapter.insertToRoundHole("adapter");
		
	}

}
