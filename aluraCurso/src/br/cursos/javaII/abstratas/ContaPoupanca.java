package br.cursos.javaII.abstratas;

public class ContaPoupanca extends Conta {

	@Override
	void deposita(double i) {
		this.saldo = this.getSaldo()+ i;
		
	}
	//public void atualiza(Double taxa) {
		//this.saldo = this.saldo + (this.saldo * taxa / 100 * 2);
	//}

	@Override
	public void atualiza(Double taxa) {
		// TODO Stub de método gerado automaticamente
		this.saldo = this.saldo + (this.saldo * taxa / 100);
		
	}



}
