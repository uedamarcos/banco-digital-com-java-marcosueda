
public class Main {
	public static void main(String[] args) {
		
		Cliente marcos = new Cliente();
		marcos.setNome("Marcos");
		marcos.setEndereco("Rua João André, 106, CEP:38.600-000 , Paracatú, MG");
		

		Banco bancodobrasil = new Banco();
		bancodobrasil.setNome("Banco do Brasil");


		
		Conta cc = new ContaCorrente(bancodobrasil, marcos);
		
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(bancodobrasil, marcos);
		
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
	}

}
