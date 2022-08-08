
public class Agencia {
	private static String contasDaAgencia = "";
	

	public Agencia() {
		
	}
	

	public static String getContasDaAgencia() {
		return contasDaAgencia;
	}
	
	public static void setContasDaAgencia(int conta, int agencia) {
		Agencia.contasDaAgencia += "A agencia " + agencia + " possui a conta " + conta + "\n";
	}
}
