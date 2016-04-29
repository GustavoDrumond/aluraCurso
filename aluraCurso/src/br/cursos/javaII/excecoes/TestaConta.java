package br.cursos.javaII.excecoes;

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
