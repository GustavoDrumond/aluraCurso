package heranca;

public class TestaAtualizadorDeContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);

		cp.deposita(1000);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		adc.roda(c);

		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}

}
