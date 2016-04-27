package eclipse;

public class ContaCorrente extends Conta {

@Override
public void atualiza(Double taxa) {
	
	super.atualiza(taxa * 2);
}

}
