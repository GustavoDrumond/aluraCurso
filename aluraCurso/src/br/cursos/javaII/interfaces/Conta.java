package br.cursos.javaII.interfaces;

class Conta {
    protected double saldo;
    
    
    public double getSaldo(){
    	return this.saldo;
    }
    public void deposita(double deposito){
    	this.saldo += deposito; 
    } 
    public void saca(double retirada){
    	this.saldo -= retirada;
    }
    
    public void atualiza(double taxa){
    	this.saldo += (taxa*this.saldo);
    }
}