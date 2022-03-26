package projetobanco;

public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 0001;
	
	private static int SEQUENCIAL = 1;
	
	private User cliente;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected double rendimentoMensal;
	
	
	
	public Conta(User cliente) {
		super();
		this.agencia = Conta.AGENCIA_PADRAO;
		
		this.numero = SEQUENCIAL++;
		this.saldo = 0;
		this.cliente = cliente;
	}

	public double getRendimentoMensal() {
		return rendimentoMensal;
	}

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
		System.out.println(String.format("Titular : %s" , this.cliente.getNomeUsuario()));
		System.out.println(String.format("Agencia : %d" , this.agencia));
		System.out.println(String.format("Numero : %d" , this.numero));
		System.out.println(String.format("Saldo : %f" , this.saldo));
		// TODO Auto-generated method stub
	}

	@Override
	public void sacar(double valor) {
		
		if (saldo < valor){
			this.saldo -= valor;
		// TODO Auto-generated method stub
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}

	public User getCliente() {
		return cliente;
	}


	
}
