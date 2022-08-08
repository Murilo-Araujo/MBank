
public class TestaMetodosOperacoes {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Jose Paulo","123.456.789-43");
		Cliente cliente2 = new Cliente("Maria Clara", "234.345.234-43");
		
		System.out.println(cliente1.criarConta(32));
		System.out.println(cliente2.criarConta(23));
		System.out.println(cliente2.criarConta(23));
		System.out.println(cliente1.criarConta(32));
		System.out.println();
		
		
		System.out.println(cliente1.getConta().deposita(5000));
		System.out.println(cliente1.getConta().deposita(-23));
		System.out.println(cliente2.getConta().saca(2000));
		System.out.println(cliente1.getSaldoContas());
		System.out.println(cliente2.getSaldoContas());
		System.out.println();
		
		System.out.println(cliente2.getConta2().transfere(cliente1.getConta2(), 2000));
		System.out.println(cliente1.getConta().transfere(cliente2.getConta(), 2000));
		System.out.println(cliente1.getConta().saca(50));
		System.out.println();
		System.out.println(cliente1.getSaldoContas());
		System.out.println(cliente2.getSaldoContas());
		
	}

}
