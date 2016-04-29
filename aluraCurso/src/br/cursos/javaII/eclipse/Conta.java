package br.cursos.javaII.eclipse;

public class Conta {
	private int codigo;
	private String nome;
	private double saldo = 100;

	public void atualiza(Double taxa) {
		this.saldo = this.saldo + (this.saldo * taxa / 100);
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}
}
