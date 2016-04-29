package javaAPI.pacotes.br.com.banco.conta;

public class Conta {
    protected double saldo;
    
    
    public double getSaldo(){
    	return this.saldo;
    }
    public void deposita(double valor) throws ValorInvalidoException {
    	if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor  - 0.10;        
        }              
    }
    	 

    public void saca(double retirada){
    	this.saldo -= retirada;
    }
    
    public void atualiza(double taxa){
    	this.saldo += (taxa*this.saldo);
    }
}