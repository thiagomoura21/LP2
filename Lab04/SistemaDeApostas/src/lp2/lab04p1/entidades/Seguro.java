package lp2.lab04p1.entidades;

/**
 * Classe responsável por representar um seguro para os seus subtipos.
 * 
 * Laboratório de Programação 2 - Lab 04 Parte 01
 * 
 * @author Thiago Santos de Moura - 116210967
 */

public abstract class Seguro {

	private String tipo;

	public Seguro(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return " - ASSEGURADA (" + this.tipo + ")";
	}

	public abstract int retornaSeguro(int aposta);
}
