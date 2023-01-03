package model.world;

import java.util.Comparator;

import model.agents.Agent;

public class CoordComparator implements Comparator<Agent> {

	@Override
	public int compare(Agent o1, Agent o2) {
		if (o1.getCoord().x < o2.getCoord().x) { return -1; }
		else if (o1.getCoord().x > o2.getCoord().x) { return 1; }
		else {
			if (o1.getCoord().y < o2.getCoord().y) { return -1; }
			else if (o1.getCoord().y > o2.getCoord().y) { return 1; }
		}
		return 0;
	}

}
