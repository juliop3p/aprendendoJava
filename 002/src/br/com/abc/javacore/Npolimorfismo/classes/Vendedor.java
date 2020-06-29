package br.com.abc.javacore.Npolimorfismo.classes;

public class Vendedor extends Funcionario {
	private double totVendas;
	
	public Vendedor(String nome, double salario, double totVendas) {
		super(nome, salario);
		this.totVendas = totVendas;
	}

	public double getTotVendas() {
		return totVendas;
	}

	public void setTotVendas(double totVendas) {
		this.totVendas = totVendas;
	}

	@Override
	public void calcularPagamento() {
		this.salario = this.salario + (this.totVendas * 0.05);
	}
	
}
