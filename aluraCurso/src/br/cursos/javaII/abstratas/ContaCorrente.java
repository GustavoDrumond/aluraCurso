package br.cursos.javaII.abstratas;

public class ContaCorrente extends Conta {

@Override
public void atualiza(Double taxa) {
	
	this.saldo = this.saldo + (this.saldo * taxa / 100);
}

public void deposita(double i) {
	this.saldo = this.getSaldo()+ i;
	
}

}
