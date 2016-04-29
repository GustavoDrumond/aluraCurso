package br.cursos.javaII.interfaces;
import java.lang.Math;

public class Circulo implements AreaCalculavel {

	private double raio;
	
	public Circulo(double i) {
		// TODO Stub de construtor gerado automaticamente
		this.raio = i;
	}

	public double calculaArea() {
		// TODO Stub de método gerado automaticamente
		return this.raio * this.raio * Math.PI;
	}

}
