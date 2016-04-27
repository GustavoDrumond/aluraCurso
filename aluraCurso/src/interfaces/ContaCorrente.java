package interfaces;

public class ContaCorrente extends Conta implements Tributavel {

	
    public void atualiza(double taxa){
    	this.saldo += (2*taxa*this.saldo);
    }

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
		
	}
}
