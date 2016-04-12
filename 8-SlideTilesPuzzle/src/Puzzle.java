
/**
 * Contain elements about this puzzle
 * @author Shuqing Zhang
 * @date April/11/2016
 * @lastUpadte April/11/2016
 */
import java.util.*;


class Puzzle {
	
	//Initial state of baord
	public State initialBoard;
	
	//current state of board
	public State currentBoard;
	
	//Initial capacity of priority queue
	static final int CAPACITY = 100;
	
	//Priority queue to save path of move step
	public final PriorityQueue<State> queue = new PriorityQueue<State>(CAPACITY, new Comparator<State>() {
		
		public int compare(State o1, State o2) {
			return o1.f() - o2.f();
		}
	}
	);
	
	//Hash set contains visited state
	public final HashSet<State> visited = new HashSet<State>();
	
	
	public Puzzle(int[] input) {
		
	}
	
	
	//Get heuristic function of each state
	public static int getH(int[] array) {
		
		return -1;
	}

}
