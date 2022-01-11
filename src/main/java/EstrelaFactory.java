import java.util.HashMap;
import java.util.Map;

public class EstrelaFactory {
    private static Map<String, TipoEstrela> estrelas = new HashMap<>();

    public static TipoEstrela getEstrela(String nome, String cor, float tamanho) {
        TipoEstrela tipoEstrela = estrelas.get(nome);
        if(tipoEstrela == null) {
            tipoEstrela = new TipoEstrela(nome, cor, tamanho);
            estrelas.put(nome, tipoEstrela);
        }
        return tipoEstrela;
    }

    public static int getNumeroEstrelas() {
        return estrelas.size();
    }
}
