
public class TestaClienteEConta {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Murilo Marcal", "222.222.222-22");
		System.out.println(cliente.criarConta(34)); 
		/* Primeiro parametro para colocar a agencia da conta, 
		ja o segundo para nunca criar uma conta com o mesmo numero */
		
		System.out.println(cliente.getContas());
		System.out.println(Banco.getInInformacoesBanco());
		System.out.println();
		
		Cliente cliente2 = new Cliente("Paulo Plineo", "352.322.209-36");
		
		System.out.println(cliente2.criarConta(36));
		
		System.out.println(cliente2.getContas());
		System.out.println(Banco.getInInformacoesBanco());
		System.out.println();
		
		System.out.println(cliente2.criarConta(36));
		System.out.println(Banco.getInInformacoesBanco());
		System.out.println(cliente2.getContas());
		System.out.println();
		
		Cliente cliente3 = new Cliente("Jose pequin", "313.122.209.34");
		Cliente cliente4 = new Cliente("Alberto jose", "313.122.209.34");
		System.out.println(cliente3.criarConta(56));
		System.out.println(cliente4.criarConta(56));
		System.out.println(cliente3.criarConta(56));
		System.out.println(cliente4.criarConta(56));
		System.out.println(Banco.getInInformacoesBanco());
		System.out.println(cliente3.getContas());
		System.out.println(cliente4.getContas());
		System.out.println();
		
		System.out.println(Agencia.getContasDaAgencia());
		
		System.out.println(cliente2.getConta().getCliente().getNome());
		Conta conta1 = cliente2.getConta();
		System.out.println(conta1.getCliente().getNome());
	}
	

}