package exerciciofinal;

public class ProjetoYoutube {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 POO");
		v[1] = new Video("Aula 2 POO");
		v[2] = new Video("Aula 3 POO");
		
		Gafanhoto g[] = new Gafanhoto[2];
		
		g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
		g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
		
		Visualizacao z[] = new Visualizacao[5];
		
		z[0] = new Visualizacao(g[0], v[0]);
		z[1] = new Visualizacao(g[0], v[1]);
		
		z[0].avaliar();
		z[1].avaliar(87.0f);
		
		System.out.println("VISUALIZAÇÃO\n---------------------------------");
		System.out.println(z[0].toString());
		System.out.println(z[1].toString());
		
		System.out.println("VÍDEOS\n---------------------------------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println("GAFANHOTOS\n---------------------------------");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
	}

}
