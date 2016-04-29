package javaAPI.pacotes.br.com.banco;
import javaAPI.pacotes.br.com.banco.conta.Conta;
import javaAPI.pacotes.br.com.banco.conta.ValorInvalidoException;

public class TestaConta {

	public static void main(String[] args) {
		// Conta c = new Conta();
		// c.deposita(2);
		// System.out.println(c.getSaldo());

		Conta cp = new Conta();
		 //cp.deposita(-100);
		try {
			cp.deposita(-100);

		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

}
