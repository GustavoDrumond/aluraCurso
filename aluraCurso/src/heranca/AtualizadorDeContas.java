package heranca;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
    public double getSaldoTotal() {
		return saldoTotal;
	}


    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        System.out.print("Saldo anterior"+c.getSaldo());
        // atualiza a conta com a taxa selic,
        c.atualiza(this.selic);
        // e depois imprime o saldo final
        System.out.print("Saldo anterior"+c.getSaldo());
        // lembrando de somar o saldo final ao atributo saldoTotal
        this.saldoTotal += c.getSaldo();
    }

    // outros métodos, colocar o getter para saldoTotal!
    //public void roda(Conta c) {
    //    System.out.println("===============================");
    //    System.out.println("Saldo anterior: " + c.getSaldo());
    //    c.atualiza(this.selic);
    //    System.out.println("Saldo atualizado: " + c.getSaldo());
    //    this.saldoTotal += c.getSaldo();
    //}
}
