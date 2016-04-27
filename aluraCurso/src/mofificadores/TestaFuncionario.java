package mofificadores;

public class TestaFuncionario {
    public static void main(String[] args) {
             
        Empresa empresa = new Empresa(null);
    //    empresa.empregados = new Funcionario[20];

        Funcionario f1 = new Funcionario();
        f1.setNome("Gustavo");
        f1.setSalario(1000);
        empresa.adiciona(f1);

        Funcionario f2 = new Funcionario();
        f2.setSalario(1700);
        f2.setNome("Henrique");
        empresa.adiciona(f2);
        empresa.adiciona(f1);
        empresa.adiciona(f2);

        empresa.mostraTodasAsInformacoes();

}}
