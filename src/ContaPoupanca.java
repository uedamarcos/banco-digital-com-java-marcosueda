
public class ContaPoupanca extends Conta {
	public ContaPoupanca(Banco banco, Cliente cliente) {
		super(banco , cliente);
	}
	public void imprimirExtrato() {
		System.out.println("Extrato Poupança");
		super.imprimirInfosComuns();
	}
}
	

