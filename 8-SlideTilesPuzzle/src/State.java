/**
 * State method for each board state
 * @author Shuqing Zhang
 * @date April/10/2016
 * @lastUpdate April/11/2016
 */

import java.util.Arrays;
	
class State {
		
	//Array represents current board state
	public int[] board = new int[9];
	
	//The index of blank tile on board
	public int blankIndex;
	
	//The previous state
	private State prev;
	
	//The real cost from initial state to now
	private int g;
	
	//The estimated cost from current state to goal
	private int h;
	
	//Construct initial board state
	public State(int[] input) {
		this.board = input;
		this.blankIndex = getBlank(input, 0);
		this.prev = null;
		this.g = 0;
		this.h = Puzzle.getH(this.board);
	}
	
	//Construct board depends on preivous state and new blank position
	public State(State previous, int blankIndex) {
		this.board = Arrays.copyOf(prev.board, prev.board.length);
		this.board[prev.blankIndex] = this.board[blankIndex];
		this.board[blankIndex] = 0;
		this.g = prev.g + 1;
		this.h = Puzzle.getH(this.board);
		this.prev = prev;
	}
	
	//Get index of blank tile
	public static int getBlank(int[] board, int value) {
		for (int i = 0; i < board.length; i++) {
			if (board[i] == value)
				return i;
		}
		return -1;
	}
	
	//Check the puzzle is solved
	public boolean isSolved() {
		int[] goal = this.board;
		for(int i = 1; i < board.length - 1; i++) {
			if(goal[i - 1] > goal[i])
				return false;
		}
		return true;
	}
	
	//Get g(n)
	public int g() {
		return this.g;
	}
	
	//Get h(n)
	public int h() {
		return this.h;
	}
	
	//Get f(n)
	public int f() {
		return g() + h();
	}
	//Get previous board
	public State getPrevious() {
		return this.prev;
	}

}
