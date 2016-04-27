package eclipse;

public class AtualizadorDeContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		Conta c = new Conta();
		c.atualiza(2.0);
		
	   ContaCorrente contaCorrente = new ContaCorrente();
	   contaCorrente.atualiza(2.0);
		System.out.println(c.getSaldo());
		System.out.println(contaCorrente.getSaldo());
		
		new AtualizadorDeContas();
	}

}
