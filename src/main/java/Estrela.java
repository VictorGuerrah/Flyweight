public class Estrela {
    private String composicao;
    private TipoEstrela tipoEstrela;

    public Estrela(String composicao, TipoEstrela tipoEstrela) {
        this.composicao = composicao;
        this.tipoEstrela = tipoEstrela;
    }

    public String obterEstrela() {
        return "Estrela{ " +
                "nome = " + tipoEstrela.getNome() + '\n'+
                "cor = " + tipoEstrela.getCor() + '\n'+
                "tamanho = " + this.composicao + '\n'+
                "}";
    }
}
