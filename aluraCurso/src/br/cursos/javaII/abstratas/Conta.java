package br.cursos.javaII.abstratas;

 public abstract class Conta {
	private int codigo;
	private String nome;
	protected double saldo = 100;
	
	abstract void deposita(double valor);

	abstract public void atualiza(Double taxa);

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
