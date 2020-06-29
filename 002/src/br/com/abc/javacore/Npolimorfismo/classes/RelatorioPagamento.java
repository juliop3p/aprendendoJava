package br.com.abc.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {
//	public void relatorioPagamentoGerente(Gerente gerente) {
//		System.out.println("Gerando Relatório de Pagamento para Gerência.");
//		gerente.calcularPagamento();
//		System.out.println("Nome: " + gerente.getNome());
//		System.out.println("Salário desse mês é R$: " + gerente.getSalario());
//		
//	}
//	
//	public void relatorioPagamentoVendedor(Vendedor vendedor) {
//		System.out.println("Gerando Relatório de Pagamento para Vendedor.");
//		vendedor.calcularPagamento();
//		System.out.println("Nome: " + vendedor.getNome());
//		System.out.println("Salário desse mês é R$: " + vendedor.getSalario());
//	}
	
	public void relatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("Gerando Relatório de Pagamento");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salário desse mês é R$: " + funcionario.getSalario());
		
		if(funcionario instanceof Gerente) {
			System.out.println("Participação nos lucros: " + ((Gerente)funcionario).getPnl());
		}
		
		if(funcionario instanceof Vendedor) {			
			System.out.println("Total vendas: R$" + ((Vendedor) funcionario).getTotVendas());
		}
	}
}
