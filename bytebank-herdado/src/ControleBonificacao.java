public class ControleBonificacao {
	
	private double soma;

	public void regitra(Funcionario f) {
		this.soma += f.getBonificacao();
	}

	public double getSoma() {
		return soma;
	}

}
