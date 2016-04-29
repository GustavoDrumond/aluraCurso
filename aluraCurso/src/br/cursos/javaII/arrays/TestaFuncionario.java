package br.cursos.javaII.arrays;

public class TestaFuncionario {
    public static void main(String[] args) {
        //Funcionario f1 = new Funcionario();

        //f1.id = 1;
        //f1.nome = "Hugo";
        //f1.idDepartamento = 1;
        //f1.salario = 100;
        //f1.recebeAumento(50);
        //f1.rg = 1008468;

        //f1.dataDeEntrada = new Data();
        //f1.dataDeEntrada.preencheData(1, 7, 2009);

        
        //f1.salario = 1234;
        
        //System.out.println("salario atual: " + f1.salario);
        //System.out.println("ganho anual: " + f1.calculaGanhoAnual());
/*    	Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];
        
        for (int i = 0; i < 5; i++) {
            Funcionario f = new Funcionario();
            f.salario = 1000 + i * 100;
            empresa.adiciona(f);
            f.dataDeEntrada = new Data();
            f.dataDeEntrada.preencheData(1, 7, 2009);
            f.mostra();
            System.out.print("#--------------------#");
        }*/
        
        
        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[20];

        Funcionario f1 = new Funcionario();
        f1.nome = "Gustavo";
        f1.salario = 1000;
        empresa.adiciona(f1);

        Funcionario f2 = new Funcionario();
        f2.salario = 1700;
        f2.nome = "Henrique";
        empresa.adiciona(f2);
        empresa.adiciona(f1);
        empresa.adiciona(f2);

        //empresa.empregados[0].mostra();
        //empresa.empregados[1].mostra();
    
        empresa.mostraTodasAsInformacoes();

}}
