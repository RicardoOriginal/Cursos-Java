
public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCPF("222.222.222-22");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
//		nico.salario = 500.0;
	}
}
