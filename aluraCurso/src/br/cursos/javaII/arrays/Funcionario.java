package br.cursos.javaII.arrays;

class Funcionario {
	int id;
	String nome;
	int idDepartamento;
	double salario;
	String dataEntrada;
	int rg;
	Data dataDeEntrada;

	public void recebeAumento(double aumento){
	this.salario += aumento;
	}
	public double calculaGanhoAnual(){
	double GanhoAnual = this.salario * 12;
	return(GanhoAnual);
	}
	void mostra() {
	                System.out.println("id: " + this.id);
					System.out.println("Nome: " + this.nome);
					System.out.println("idDepartamento: " + this.idDepartamento);
					System.out.println("salario: " + this.salario);
					System.out.println("dataEntrada: " + this.dataEntrada);
					System.out.println("rg: " + this.rg);
	                System.out.println("calculaGanhoAnual" +this.calculaGanhoAnual());
	                
	               // System.out.println("Dia: " + this.dataDeEntrada.dia);
	               // System.out.println("Mês: " + this.dataDeEntrada.mes);
	               // System.out.println("Ano: " + this.dataDeEntrada.ano);
	                
	               // System.out.println("Data de entrada: " + this.dataDeEntrada.getFormatada());
	            }
	


}
