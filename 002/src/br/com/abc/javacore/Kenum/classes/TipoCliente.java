package br.com.abc.javacore.Kenum.classes;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Jur�dica") {
		public String getId() {
			return "B";
		}
	};
	
	private int tipo;
	private String nome;
	
	private TipoCliente(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}
	
	public String getId() {
		return "A";
	}

	public int getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

}
