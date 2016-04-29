package br.cursos.javaII.excecoes;

public class ContaPoupanca extends Conta {

    public void atualiza(double taxa){
    	this.saldo += (3*taxa*this.saldo);
    	
    }
    public void deposita(double deposito){
    	if (deposito < 0) {
            throw new IllegalArgumentException("Você tentou depositar" + 
                                                " um valor negativo");
        } else {
            this.saldo += deposito  - 0.10;        
        }   
    }
}
	