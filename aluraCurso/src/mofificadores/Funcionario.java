package mofificadores;

class Funcionario {
	private int id;
	private String nome;
	private int idDepartamento;
	private double salario;
	private int rg;
	private Data dataEntrada;

	public void setAumento(double aumento){
		this.salario += aumento;
	}
	public double getGanhoAnual(){
		double GanhoAnual = this.salario * 12;
		return(GanhoAnual);
	}
	void mostra() {
	                System.out.println("id: " + this.id);
					System.out.println("Nome: " + this.nome);
					System.out.println("idDepartamento: " + this.idDepartamento);
					System.out.println("salario: " + this.salario);
//					System.out.println("dataEntrada: " + this.dataEntrada);
					System.out.println("rg: " + this.rg);
	                System.out.println("calculaGanhoAnual" +this.getGanhoAnual());
	                
	               // System.out.println("Dia: " + this.dataDeEntrada.dia);
	               // System.out.println("Mês: " + this.dataDeEntrada.mes);
	               // System.out.println("Ano: " + this.dataDeEntrada.ano);
	                
	               // System.out.println("Data de entrada: " + this.dataDeEntrada.getFormatada());
	            }
	
    public Data getDataEntrada() {
        return this.dataEntrada;
    }

    public void setDataEntrada (Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
        
	public int getRg(){
		return this.rg;
	}
	public void setRg(int rg){
		this.rg = rg;
	}
	public void setIdDepartamento(int idDepartamento){
		this.idDepartamento = idDepartamento;
	}
	public int getIdDepartametno(){
		return this.idDepartamento;
	}
	
	public double getSalario(){
		return this.salario;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	
	

}


