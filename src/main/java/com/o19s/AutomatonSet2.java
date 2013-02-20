package com.o19s;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.lucene.util.automaton.Automaton;
import org.apache.lucene.util.automaton.BasicAutomata;

public class AutomatonSet2 {
	
	private List<Automaton> allTermAutomata;

	public void add(String newTerm) {
		allTermAutomata.add(BasicAutomata.makeString(newTerm));
	}	
	
	public int numNodes() {
		return allTermAutomata.size();
	}
	
	public AutomatonSet2() {
		allTermAutomata = new LinkedList<Automaton>();
	}

}
