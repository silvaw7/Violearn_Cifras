package principal;
import java.util.List;

public class Playlist {
	
	 private String nomePlaylist;
	    private Musica[] musicas;
	    private int tamanho;

	    public Playlist(String nomePlaylist) {
	        this.nomePlaylist = nomePlaylist;
	        this.musicas = new Musica[10]; // Inicializa o vetor de músicas com tamanho 10
	        this.tamanho = 0;
	    }

	    public String getNomePlaylist() {
	        return nomePlaylist;
	    }

	    public  void setNomePlaylist(String nomePlaylist) {
	        this.nomePlaylist = nomePlaylist;
	    }

	    public void adicionarMusica(Musica musica) {
	        if (tamanho < 10) {
	            // Verifica se a música já está na playlist
	            boolean musicaJaAdicionada = false;
	            for (int i = 0; i < tamanho; i++) {
	                if (musicas[i] != null && musicas[i].equals(musica)) {
	                    musicaJaAdicionada = true;
	                    break; // Se a música já foi adicionada, saia do loop.
	                }
	            }

	            if (!musicaJaAdicionada) {
	                musicas[tamanho] = musica;
	                tamanho++;
	                System.out.println("Música: " + "'" + musica.getNomeMusica() + "'" + " adicionada na Playlist");
	            } else {
	                System.out.println("Essa música já está na playlist.");
	            }
	        } else {
	            System.out.println("A playlist está cheia. Não é possível adicionar mais músicas.");
	        }
	    }

	    
	    
	    public void excluirMusica(int indiceMusica) {
	        if (indiceMusica >= 0 && indiceMusica < tamanho) {
	            for (int i = indiceMusica; i < tamanho - 1; i++) {
	                musicas[i] = musicas[i + 1];
	            }
	            musicas[tamanho - 1] = null; // Remove a última referência para evitar duplicatas

	            tamanho--;
	        } else {
	            System.out.println("Índice de música inválido.");
	        }
	    }
	
	    

	    public void mostrarPlaylist() {
	        System.out.println("----------------------------------------\n");
	        if(nomePlaylist == null) {
	        	System.out.println("A playlist ainda não tem nome;");
	        }
	        else {
	        	System.out.println("Playlist: " + nomePlaylist + "\n");	
	        }
	        System.out.println("Músicas na playlist: \n");
	        for (int i = 0; i < tamanho; i++) {
	            System.out.println((i + 1) + ". " + musicas[i].getNomeMusica() + " - " + musicas[i].getCompositor());
	        }
	        System.out.println("\n----------------------------------------\n");
	    }
	    
	    public void mostrarMusica(int id) {
	    	if(musicas[id] == null) {
	        	System.out.println("Índice inválido, tente novamente");
	        } else {
	        	System.out.println("----------------------------------------\n");
		        musicas[id].imprimirCifra();
		        System.out.println("\n----------------------------------------\n");
	        }
	    	
	        
	    }
	    
	    public void excluirPlayList() {
	    	if(isNull()) {
	    		System.out.println("A playlist está vazia");
	    	}
	    	this.nomePlaylist = null;
	    	this.musicas = new Musica[10];
	    	this.tamanho = 0;
	    	
	    	System.out.println("A playlist foi excluída");
	    }
	    
	    public boolean isNull() {
	        for (int i = 0; i < musicas.length; i++) {
	            if (musicas[i] != null) {
	                return false;
	            }
	        }
	        // Se nenhum elemento não nulo foi encontrado
	        return true;
	    }

		public int getTamanho() {
			// TODO Auto-generated method stub
			return tamanho;
		}

}
