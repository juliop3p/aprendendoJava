package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gina");
        pessoa.setCpf("452123");

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 25");
        endereco.setBairro("Jardim Melo");

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Pablo");
        funcionario.setCpf("789456");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(18000);

        pessoa.setEndereco(endereco);
        pessoa.print();
        System.out.println("---------------------");
        funcionario.print();
    }
}
