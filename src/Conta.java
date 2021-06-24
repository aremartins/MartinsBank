
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		total++;
		System.out.println("O total de contas é " + total);
		if (agencia <= 0) {
			System.out.println("Número deve ser maior que 0");
		}
		this.agencia = agencia;
		if (numero <= 0) {
			System.out.println("Número deve ser maior que 0");
		}
		this.numero = numero;

		System.out.println("Estou criando uma conta" + ' ' + agencia + ' ' + numero);
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("O número deve ser maior que 0");
		}
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("O número deve ser maior que 0");
		}
		this.agencia = agencia;
	}

	public int getAgencia() {
		return this.agencia;
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
