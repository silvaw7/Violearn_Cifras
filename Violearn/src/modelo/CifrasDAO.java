package modelo;

public class CifrasDAO {
    private String nomeColecao;
    private Cifras[] colecao;

    // coleção de cifras recebe nome e tamanho do usuário
    public CifrasDAO(String nomeColecao, int tamanho) {
        this.nomeColecao = nomeColecao;
        colecao = new Cifras[tamanho];
    }
}