
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static  int SEQUENCIAL = 1;
	
	protected Banco banco;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

    public Conta(Banco banco, Cliente cliente) {
    	this.banco = banco;
    	this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    
	 public void sacar(double valor) {
		 saldo -= valor;
	 }
	 public void depositar(double valor){
		 saldo += valor;
	 }
	 public void transferir(double valor, Conta contaDestino){
		 this.sacar(valor);
		 contaDestino.depositar(valor);
	 };


	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Banco: %s", this.banco.getNome()));
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Endereço Titular: %s", this.cliente.getEndereco()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println();
	}
}

