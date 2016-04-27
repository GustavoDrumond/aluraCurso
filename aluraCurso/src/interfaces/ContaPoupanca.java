package interfaces;

public class ContaPoupanca extends Conta {

    public void atualiza(double taxa){
    	this.saldo += (3*taxa*this.saldo);
    	
    }
    public void deposita(double deposito){
    	this.saldo += deposito - 0.1; 
    }
}
