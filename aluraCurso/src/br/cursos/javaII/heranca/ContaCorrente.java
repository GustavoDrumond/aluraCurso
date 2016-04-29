package br.cursos.javaII.heranca;

public class ContaCorrente extends Conta {

	
    public void atualiza(double taxa){
    	this.saldo += (2*taxa*this.saldo);
    }
}
