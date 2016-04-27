package arrays;

class Empresa {
    Funcionario[] empregados;
    String cnpj;
    int livre = 0;

    void adiciona(Funcionario f) {
        this.empregados[this.livre] = f;
        this.livre++;
    }
    void mostraEmpregados() {
       for (int i = 0; i < this.livre; i++) {
       // for ( Funcionario x : this.empregados ) {
       //         System.out.println(x.nome);
    	   if (this.empregados[i] != null) { 
            System.out.println("Funcionário na posição: " + i +"/"+  this.empregados.length+" - "+  this.empregados[i].nome+" - "+  this.empregados[i].salario);
    	   }
        }
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

