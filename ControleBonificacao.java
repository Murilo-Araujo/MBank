
public class ControleBonificacao {
	private double bonificacao;
	
	public void bonificacao(Funcionario funcionario) {
		bonificacao += funcionario.getBonificacao();
	}
	
	public double getBonificacao() {
		return bonificacao;
	}
	
}
