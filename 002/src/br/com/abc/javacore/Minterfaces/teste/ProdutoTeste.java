package br.com.abc.javacore.Minterfaces.teste;

import br.com.abc.javacore.Minterfaces.classes.Produto;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p = new Produto("Notebook", 4, 3000);
		
		p.calculaImposto();
		p.calculaFrete();
		
		System.out.println(p);
	}

}