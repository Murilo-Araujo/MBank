
public class dasdas {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("eduardo", "203.123.142-23");
		System.out.println(cliente.criarConta(34));
		System.out.println(cliente.criarConta(45));
		System.out.println(cliente.criarConta(34));
		System.out.println(cliente.getContas());
		
		cliente.getConta().deposita(5000);
		System.out.println(cliente.getConta().getSaldo());
		cliente.getConta2().deposita(3000);
		System.out.println(cliente.getSaldoContas());
		System.out.println(cliente.getConta().transfere(cliente.getConta2(), 200));
		System.out.println(cliente.getSaldoContas());

	}

}
