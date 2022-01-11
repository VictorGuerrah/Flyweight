public class TipoEstrela {
    private String nome;
    private String cor;
    private float tamanho;

    public TipoEstrela(String nome, String cor, float tamanho) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public float getTamanho() {
        return tamanho;
    }
}
