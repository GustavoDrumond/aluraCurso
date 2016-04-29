package br.cursos.javaII.excecoes;

public class ValorInvalidoException extends Exception  {


	public ValorInvalidoException(double valor) {
        super("Valor invalido: " + valor);
    }

	public ValorInvalidoException() {
		// TODO Auto-generated constructor stub
	}

}
