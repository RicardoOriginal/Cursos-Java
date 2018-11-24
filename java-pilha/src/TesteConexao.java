public class TesteConexao {
	public static void main(String[] args) throws Exception{
		try(Conexao c = new Conexao()){
			c.leDados();
		} catch(IllegalStateException ex) {
	        System.out.println("Deu erro na conexao");
	    }
	}
}