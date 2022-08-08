
public class Main {

	public static void main(String[] args) {
		Cliente isaias = new Cliente();
		isaias.setNome("Isaias");
		
		Conta cc = new ContaCorrente(isaias);
		Conta poupanca = new ContaPoupanca(isaias);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
