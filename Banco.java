
public class Banco {
	
	public static String getInInformacoesBanco() {
		
		if(Conta.getTotalDeContas() != 1) {
			return Cliente.getTotalDeClientesString()+ " e " + Conta.getTotalDeContas() + " contas";
		} else {
			return Cliente.getTotalDeClientesString()+ " e " + Conta.getTotalDeContas() + " conta";
		}
	}
}
