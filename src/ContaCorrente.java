
public class ContaCorrente extends Conta{

	@Override
	public void imprimirExtrato() {
		System.out.println("*** CONTA CORRENTE ***");
		super.imprimirInfosComuns();
	}
	
}
