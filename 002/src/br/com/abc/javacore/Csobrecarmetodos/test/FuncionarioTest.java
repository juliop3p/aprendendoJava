package br.com.abc.javacore.Csobrecarmetodos.test;

import br.com.abc.javacore.Csobrecarmetodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2 = new Funcionario("Goku", "548.958.025-1", "123.456.789-02", 9999);

        funcionario.init("Naruto", "548.958.025-1", "123.456.789-02", 20000);

        funcionario.imprime();
        funcionario2.imprime();

    }
}
