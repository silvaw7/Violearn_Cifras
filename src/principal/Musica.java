package principal;

public class Musica {
    private String compositor;
    private String nomeMusica;
    private String cifra;

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }
    
    public String getCifra() {
        return cifra;
    }

    public void setCifra(String cifra) {
        this.cifra = cifra;
    }
    
    public void imprimirDetalhes() {
    	System.out.println("Título: " + nomeMusica);
        System.out.println("Artista: " + compositor);
        System.out.println("-----------------------");
    }
    
    public void imprimirCifra() {
    	System.out.println("Título: " + nomeMusica);
        System.out.println("Artista: " + compositor);
        System.out.println("-----------------------");
        System.out.println(cifra);
    }
}
