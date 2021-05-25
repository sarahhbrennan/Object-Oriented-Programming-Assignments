//Sarah Brennan 2962279
public enum ChessPiece {
	PAWN, KNIGHT, BISHOP, KING, ROOK, QUEEN;
	
	public String toString()
	{
		/*pretty prints the names of the chess pieces*/
		switch (this)
		{
			case PAWN:
				return "pawn";
			case KNIGHT:
				return "knight";
			case BISHOP:
				return "bishop";
			case KING:
				return "king";
			case ROOK:
				return "rook";
			default:
				return "queen";
		}
	}
	
	/*Returns the value of each chess piece*/
	public int value()
	{
		switch (this)
		{
			case PAWN:
				return 1;
			case KNIGHT:
				return 3;
			case BISHOP:
				return 3;
			case KING:
				return 4;
			case ROOK:
				return 5;
			default:
				return 9;
		}
	}
}
