
public class TestaConta {
	public static void main(String[] args) {
		
		Cliente aretha = new Cliente(); //cria o cliente
		aretha.setNome("Aretha Martins");
		aretha.setCpf("388.258.254-12");
		aretha.setProfissao("programadora");
		
		Conta contaDaAretha = new Conta(288, 17287); //cria a conta		
		
		contaDaAretha.setTitular(aretha); //vincula o cliente como titular da conta
		
		//verifica dados da conta:
		System.out.println(contaDaAretha.getTitular());     
		System.out.println(contaDaAretha.getTitular().getNome());
		System.out.println(contaDaAretha.getTitular().getCpf());
		System.out.println(contaDaAretha.getTitular().getProfissao());
		System.out.println(contaDaAretha.getAgencia());
		
		//operando com a conta
	    contaDaAretha.deposita(500.0);
		contaDaAretha.saca(20.0);
		
		System.out.println(contaDaAretha.getSaldo());
		
		
		System.out.println(Conta.getTotal());
			
	}

}
