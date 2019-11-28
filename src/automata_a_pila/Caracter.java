package automata_a_pila;

/**
 * 
 * @author alu0101038377
 * @descripcion Representa a los símbolos de la cinta
 *
 */
public class Caracter {
	private String caracter_;
	
	public Caracter(String caracter) {
		setSimbolo(caracter);
	}

	public String getSimbolo() {
		return caracter_;
	}

	public void setSimbolo(String caracter) {
		this.caracter_ = caracter;
	}
}
