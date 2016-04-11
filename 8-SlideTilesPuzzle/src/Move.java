/**
 * Move method for moving blank tile
 * @author Shuqing Zhang
 * @date April/10/2016
 * @lastUpdate April/11/2016
 */
class Move {

	private Move() {
		
	}
	
	//Move the blank tile up, return new board
	public static State up(State board) {
		if (board.blankIndex > 2)
			return new State(board, board.blankIndex - 3);
		return null;
	}
	
	//Move the blank tile down, return new board
	public static State down(State board) {
		if (board.blankIndex > 5)
			return new State(board, board.blankIndex + 3);
		return null;
	}
	
	//Move the blank tile left, return new board
	public static State left(State board) {
		if (board.blankIndex % 3 != 0)
			return new State(board, board.blankIndex - 1);
		return null;
	}
	
	//Move the blank tile right, return new board
	public static State right(State board) {
		if (board.blankIndex % 3 < 2)
			return new State(board, board.blankIndex + 1);
		return null;
	}
}
