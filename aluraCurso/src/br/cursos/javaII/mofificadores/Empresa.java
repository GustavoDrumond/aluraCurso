package br.cursos.javaII.mofificadores;

class Empresa {
    private Funcionario[] empregados;
    private String cnpj;
    private int livre = 0;

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
        this.empregados = new Funcionario[10];
    }

    public void setCnpj(String cnpj){
    	this.cnpj = cnpj;
    }
    public String getCnpj(){
    	return this.cnpj;
    }
    void adiciona(Funcionario f) {
        this.empregados[this.livre] = f;
        this.livre++;
    }
    void getEmpregados() {
       for (int i = 0; i < this.livre; i++) {
       // for ( Funcionario x : this.empregados ) {
       //         System.out.println(x.nome);
    	   if (this.empregados[i] != null) { 
            System.out.println("Funcionário na posição: " + i +"/"+  this.empregados.length+" - "+  this.empregados[i].getNome()+" - "+  this.empregados[i].getSalario() );
    	   }
        }
    }
    
    public Funcionario getFuncionario(int posicao) {
        return this.empregados[posicao];
    }
    
    void mostraTodasAsInformacoes(){
    	 for (int i = 0; i < this.livre; i++) {
    		 if (this.empregados[i] != null) { 
    			 this.empregados[i].mostra();
    	    	   }
    	 }
    }

    boolean contem(Funcionario f) {
        for (int i = 0; i < this.livre; i++) {
            if (f == this.empregados[i]) {
                return true;
            }
        }
        return false;
    }
}

