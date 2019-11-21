package automata_a_pila;


public class Estado {

	private char nombre_;
	private boolean acept_;
	private boolean inicial_;
	private Pila pila_;
	
	public Estado(char nombre) {
		setNombre(nombre);
		setAcept(false);
		setInicial(false);
		pila_=new Pila();
	}

	public char getNombre() {
		return nombre_;
	}

	public void setNombre(char nombre_) {
		this.nombre_ = nombre_;
	}

	public boolean isAcept() {
		return acept_;
	}

	public void setAcept(boolean acept_) {
		this.acept_ = acept_;
	}

	public boolean isInicial() {
		return inicial_;
	}

	public void setInicial(boolean inicial_) {
		this.inicial_ = inicial_;
	}
	
	
	
	
}
