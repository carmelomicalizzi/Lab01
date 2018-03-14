package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
	
	List<String> parole = new ArrayList<String>();
		
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole);
		return parole;
	}
	
	public void cancellaParola(String p) {
		if(parole.contains(p))
			parole.remove(p);

	}
	
	public void reset() {
		parole.clear();
	}

	public String toString() {
		
		String s = "";
		for(String str : parole)
			s += str;
		
		return s;
	}
	
	

}
