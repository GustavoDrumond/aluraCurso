package javaAPI.pacotes.br.com.banco.conta;

public class ValorInvalidoException extends Exception  {


	public ValorInvalidoException(double valor) {
        super("Valor invalido: " + valor);
    }

	public ValorInvalidoException() {
		// TODO Auto-generated constructor stub
	}

}
