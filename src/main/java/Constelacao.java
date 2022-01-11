import java.util.ArrayList;
import java.util.List;

public class Constelacao {
    private List<Estrela> estrelas = new ArrayList<>();

    public void mapearEstrela(String nome, String cor, float tamanho, String composicao) {
        TipoEstrela tipoEstrela = EstrelaFactory.getEstrela(nome, cor, tamanho);
        Estrela estrela = new Estrela(composicao, tipoEstrela);
        estrelas.add(estrela);
    }

    public List<String> obterConstelacao() {
        List<String> constelacao = new ArrayList<String>();
        for (Estrela estrela : this.estrelas) {
            constelacao.add(estrela.obterEstrela());
        }
        return constelacao;
    }
}
