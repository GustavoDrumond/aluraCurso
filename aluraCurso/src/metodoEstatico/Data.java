package metodoEstatico;
class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
		// TODO Stub de construtor gerado automaticamente
    	 this.dia = dia;
         this.mes = mes;
         this.ano = ano;
	}

	void setData (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    String getFormatada(){
    	return( this.dia + "/" +this.mes+ "/" +this.ano);
    }
}

