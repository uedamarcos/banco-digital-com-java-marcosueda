
public class ContaCorrente extends Conta {
	public ContaCorrente(Banco banco, Cliente cliente) {
		super(banco,cliente);
	}
	public void imprimirExtrato() {
		System.out.println("Extrato CC");
		super.imprimirInfosComuns();
	}
}
