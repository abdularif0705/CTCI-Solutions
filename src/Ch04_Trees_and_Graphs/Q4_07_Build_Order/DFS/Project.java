package Ch04_Trees_and_Graphs.Q4_07_Build_Order.DFS;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
	public enum State {COMPLETE, PARTIAL, BLANK};
	private ArrayList<Ch04_Trees_and_Graphs.Q4_07_Build_Order.EdgeRemoval.Project> children = new ArrayList<Ch04_Trees_and_Graphs.Q4_07_Build_Order.EdgeRemoval.Project>();
	private HashMap<String, Ch04_Trees_and_Graphs.Q4_07_Build_Order.EdgeRemoval.Project> map = new HashMap<String, Ch04_Trees_and_Graphs.Q4_07_Build_Order.EdgeRemoval.Project>();
	private String name;
	private State state = State.BLANK;
	
	public Project(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
	
	public void addNeighbor(Ch04_Trees_and_Graphs.Q4_07_Build_Order.EdgeRemoval.Project node) {
		if (!map.containsKey(node.getName())) {
			children.add(node);
			map.put(node.getName(), node);
		}
	}
	
	public State getState() { 
		return state;
	}
	
	public void setState(State st) {
		state = st;
	}
	
	public ArrayList<Ch04_Trees_and_Graphs.Q4_07_Build_Order.EdgeRemoval.Project> getChildren() {
		return children;
	}
}
