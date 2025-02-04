package trabajo_programacion;

public class Palabra {
	String termino;
	String definicion;

	Palabra() {
	}

	Palabra(String termino, String definicion) {
		this.termino = termino;
		this.definicion = definicion;
	}

	String getTermino() {
		return termino;
	}

	String getDefinicion() {
		return definicion;
	}

	void setTermino(String termino) {
		this.termino = termino;
	}

	void setDefinicion(String definicion) {
		this.definicion = definicion;
	}
}
