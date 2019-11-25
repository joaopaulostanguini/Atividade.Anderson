
public class Programa {

	public static void main(String[] args) {

		Conta contaCorrente = new ContaCorrente();
		contaCorrente.agencia = "545";
		contaCorrente.numeroConta = "659";
		contaCorrente.nomeTitular = "Luis";
		contaCorrente.saldo = 50;

		contaCorrente.deposito(500);
		contaCorrente.saque(100);
		contaCorrente.saque(100);
		contaCorrente.saque(100);
		contaCorrente.saque(100);

		System.out.println("Conta Corrente << \n\nAgencia: " + contaCorrente.agencia + "\nNumero da Conta: "
				+ contaCorrente.numeroConta + "\nNome do Titular: " + contaCorrente.nomeTitular + "\nSaldo Total: R$ "
				+ contaCorrente.saldo + "\nTaxa: R$ " + contaCorrente.taxa + "\n");

		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.agencia = "545";
		contaPoupanca.numeroConta = "555";
		contaPoupanca.nomeTitular = "Gracia";
		contaPoupanca.saldo = 1500;

		contaPoupanca.deposito(500);
		contaPoupanca.saque(30);
		contaPoupanca.saque(10);

		System.out.println(">> Conta Poupanca << \n\nAgencia: " + contaPoupanca.agencia + "\nNumero da Conta: "
				+ contaPoupanca.numeroConta + "\nNome do Titular: " + contaPoupanca.nomeTitular + "\nSaldo Total: R$ "
				+ contaPoupanca.saldo + "\nTaxa: R$ " + contaPoupanca.taxa + "\n");

		Conta contaSalario = new ContaSalario();
		contaSalario.agencia = "964";
		contaSalario.numeroConta = "554";
		contaSalario.nomeTitular = "Carlos";
		contaSalario.saldo = 0;

		contaSalario.deposito(4000);
		contaSalario.saque(1000);

		System.out.println(">> Conta Salario << \n\nAgencia: " + contaSalario.agencia + "\nNumero da Conta: "
				+ contaSalario.numeroConta + "\nNome do Titular: " + contaSalario.nomeTitular + "\nSaldo Total: R$ "
				+ contaSalario.saldo + "\nTaxa: R$ " + contaSalario.taxa + "\n");

		Relatorio relatorio = new Relatorio();
		relatorio.adicionarConta(contaCorrente);
		relatorio.adicionarConta(contaPoupanca);
		relatorio.adicionarConta(contaSalario);
		System.out.println(">> Relatorio << \n\nTotal Arrecadado pelo Banco foi de: R$ " + relatorio.taxaRecolhida());
	}
}
