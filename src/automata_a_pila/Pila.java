package automata_a_pila;

import java.util.ArrayList;

public class Pila {
	
	public ArrayList<String> pila_;
	
	public Pila(String simbolo_inicial) {
		pila_.add(simbolo_inicial);
	}
	
	public Pila() {
	}
	
	public Pila(ArrayList<String> pila) {
		pila_=pila;
	}
	
	public Pila(Object clone) {
		pila_=(ArrayList<String>) clone;
	}

	public boolean isEmpty() {
		return pila_.isEmpty();
	}
	
	public String top() {
		return pila_.get(pila_.size()-1);
	}
	
	public String pop() {
		String str=pila_.get(pila_.size()-1);
		pila_.remove(pila_.size()-1);
		return str;
	}
	
	public void push(String simbolo) {
		pila_.add(simbolo);
	}
	
	public Pila clone() {
		return new Pila(pila_.clone());
	}

}
