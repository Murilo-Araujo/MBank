
public class Conta {
	private int agenciaNome;
	private int numeroDaConta;
	private double saldo;
	private static int totalDeContas = 0;
	private Cliente cliente;

	public Conta(int numeroDaAgencia, int numeroDaConta) {
		this.agenciaNome = numeroDaAgencia;
		this.numeroDaConta = numeroDaConta;
		totalDeContas++;
		Agencia.setContasDaAgencia(numeroDaConta + 1, numeroDaAgencia);
	}

	public int getAgenciaNome() {
		return agenciaNome;
	}

	public void setAgenciaNome(int agencia) {
		this.agenciaNome = agencia;
	}


	public int getNumeroDaConta() {
		return numeroDaConta + 1;
	}

	public double getSaldo() {
		return saldo;
	}

	public int novoNumeroDeConta() {
		return Conta.getTotalDeContas() + 1;
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public static String getTotalDeContasString() {
		if (totalDeContas != 1) {
			return "O banco possui " + totalDeContas + " contas";
		} else {
			return "O banco possui " + totalDeContas + "conta";
		}
	}

	public boolean saca(int valor) {
		if (this.saldo >= valor && valor >= 1) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean deposita(int valor) {
		if (valor <= 0) {
			return false;
		} else {
			this.saldo += valor;
			return true;
		}
	}

	public boolean transfere(Conta conta, int valor) {
		if (valor <= 0) {
			return false;
		} else if (valor <= this.saldo) {
			conta.saldo += valor;
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente2) {
		this.cliente = cliente2;

	}

}
