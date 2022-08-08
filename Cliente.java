
public class Cliente {
	private String nome;
	private String cpf;
	private int ranking;
	private Conta conta;
	private Conta conta2;
	private static int totalDeClientes;

	public Cliente(String nome, String cpf) {
		this.setNome(nome);
		this.setCpf(cpf);
		totalDeClientes++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRanking() {
		if (this.ranking <= 0) {
			return "Baixa credibilidade";
		} else if (this.ranking >= 2) {
			return "Media credibilidade";
		} else {
			return "Alta credibilidade";
		}
	}

	protected void aumentaRanking() {
		this.ranking++;
	}

	protected void diminuiRanking() {
		this.ranking--;
	}

	public static int getTotalDeClientes() {
		return totalDeClientes;
	}

	public static String getTotalDeClientesString() {
		if (totalDeClientes != 1) {
			return "O banco possui " + totalDeClientes + " clientes";
		} else {
			return "O banco possui " + totalDeClientes + " cliente";
		}
	}

	public Conta getConta() {
		return conta;
	}

	public int getNovoNumeroDaConta() {
		return Conta.getTotalDeContas();
	}

	public String criarConta(int numeroDaAgencia) {
		if (this.conta == null) {

			this.conta = new Conta(numeroDaAgencia, this.getNovoNumeroDaConta());
			// pega o total de contas para sempre criar contas com numeros diferentes

			this.getConta().setCliente(this);
			return "A primeira conta do " + this.getNome() + " numero " + this.getNovoNumeroDaConta() + " da agencia "
					+ numeroDaAgencia + " criada";

		} else if (this.conta2 == null) {

			this.conta2 = new Conta(numeroDaAgencia, this.getNovoNumeroDaConta());
			this.getConta2().setCliente(this.getCliente());
			return "A segunda conta do " + this.getNome() + " numero " + this.getNovoNumeroDaConta() + " da agencia "
					+ numeroDaAgencia + " criada";

		} else {

			return "Somente duas contas por Cpf";
		}
	}

	public String getContas() {
		if (this.conta2 == null) {
			return this.getNome() + " possui a conta " + this.conta.getNumeroDaConta();
		} else {
			return this.getNome() + " possui a conta " + this.conta.getNumeroDaConta() + " e "
					+ this.conta2.getNumeroDaConta();
		}
	}

	public Cliente getCliente() {
		return this;
	}

	public Conta getConta2() {
		return conta2;
	}

	public String getSaldoContas() {
		if (this.conta2 == null)
			return " A conta " + this.conta.getNumeroDaConta() + " de " + this.nome + " possui um saldo de: "
					+ this.conta.getSaldo();
		else
			return "A conta " + this.conta.getNumeroDaConta() + " de " + this.nome + " possui um saldo de: "
					+ this.conta.getSaldo() + "\nA conta " + this.conta2.getNumeroDaConta() + " de " + this.nome  + " possui um saldo de: "
					+ this.conta2.getSaldo();
	}

}
