package construtores;
class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
		// TODO Stub de construtor gerado automaticamente
    	 this.dia = dia;
         this.mes = mes;
         this.ano = ano;
         
         if (! isDataValida(dia, mes, ano)) {
             System.out.println("A data " + getFormatada() + " não existe!");
         }         
	}

	void setData (int dia, int mes, int ano) {
		
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
	private boolean isDataValida(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0) {
            return false;
        }

        int ultimoDiaDoMes = 31; // por padrao são 31 dias
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            ultimoDiaDoMes = 28;
            if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
                ultimoDiaDoMes = 29;
            }
        }
        if (dia > ultimoDiaDoMes) {
            return false;
        }

        return true;
    }

    String getFormatada(){
    	return( this.dia + "/" +this.mes+ "/" +this.ano);
    }
}

