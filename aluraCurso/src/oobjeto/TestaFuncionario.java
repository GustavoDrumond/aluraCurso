package oobjeto;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.nome = "Hugo";
        f1.salario = 100;
        f1.recebeAumento(50);

        f1.dataDeEntrada = new Data();
        f1.dataDeEntrada.preencheData(1, 7, 2009);

        f1.mostra();
        f1.salario = 1234;
        
        System.out.println("salario atual: " + f1.salario);
        System.out.println("ganho anual: " + f1.calculaGanhoAnual());
    }

}
