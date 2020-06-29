package br.com.abc.javacore.Npolimorfismo.test;

import java.util.ArrayList;

import java.util.List;

import br.com.abc.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
import br.com.abc.javacore.Npolimorfismo.classes.DatabaseDaoImpl;
import br.com.abc.javacore.Npolimorfismo.classes.GenericDAO;

public class DAOTest {

	public static void main(String[] args) {
		GenericDAO arquivoDAO = new ArquivoDAOImpl();
		arquivoDAO.save();
		java.util.List<String> lista = new ArrayList<>();
		
		lista.add("nome1");
		lista.add("nome2");
		lista.add("nome3");
		lista.add("nome4");
		System.out.println(lista.indexOf("nome4"));
		
		for(String nome : lista) {
			System.out.println(nome);
		}
	}

}
