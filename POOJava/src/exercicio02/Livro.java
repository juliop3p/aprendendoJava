package exercicio02;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPaginaAtual());
        System.out.println("O livro esta aberto? " + this.isAberto());
        System.out.println("Nome do leitor: " + this.getLeitor().getNome());
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.paginaAtual = 0;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p <= this.getTotPaginas()) {
            this.setPaginaAtual(p);
        } else {
            System.out.println("Livro não contém essa quantidade de página.");
        }
    }

    @Override
    public void avancarPag() {
        if(this.getPaginaAtual() < this.getTotPaginas()) {
            this.setPaginaAtual(this.getPaginaAtual() + 1);
        } else {
            System.out.println("Você está na última página");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getPaginaAtual() > 0 ) {
            this.setPaginaAtual(this.getPaginaAtual() - 1);
        } else {
            System.out.println("Você está na primeira página");
        }
    }
}
