
public class ContaPoupanca extends Conta{

	@Override
	public void imprimirExtrato() {
		System.out.println("*** CONTA POUPANCA ***");
		super.imprimirInfosComuns();	
	}
	
}
