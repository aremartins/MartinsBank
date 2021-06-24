
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(288, 18759);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());

		// conta.numero = 1337 e conta.agencia = 250 - não funciona mais

		Cliente paulo = new Cliente();
		// conta.titular = paulo;

		paulo.setNome("Paulo Martins");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(conta.getTitular());
		System.out.println(paulo);
		
		Conta conta2 = new Conta(288, 18579);
		
		System.out.println(Conta.getTotal());

	}

}
