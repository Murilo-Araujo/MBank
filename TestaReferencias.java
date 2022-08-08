
public class TestaReferencias {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(2000);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(1000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.bonificacao(funcionario);
		controle.bonificacao(gerente);
		
		System.out.println(controle.getBonificacao());
	}

}
