import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.constant.Constable;
import java.util.Arrays;
import java.util.List;

class ConstelacaoTest {

    @Test
    public void deveRetornarEstrelas() {
        Constelacao constelacao = new Constelacao();
        constelacao.mapearEstrela("Sol", "Branco", 1392700, "72% Hidrogênio / 27% Helio");
        constelacao.mapearEstrela("Sirius", "Azul", 2380700, "72% Hidrogênio / 27% Helio");
        constelacao.mapearEstrela("Proxima Centauri", "Vermelho", 214550, "72% Hidrogênio / 27% Helio");

        List<String> estrelas = Arrays.asList(
                "Estrela{ nome = Sol, cor = Branco, tamanho = 72% Hidrogênio / 27% Helio}\n",
                "Estrela{ nome = Sirius, cor = Azul, tamanho = 72% Hidrogênio / 27% Helio}\n",
                "Estrela{ nome = Proxima Centauri, cor = Vermelho, tamanho = 72% Hidrogênio / 27% Helio}\n");

        assertEquals(estrelas, constelacao.obterConstelacao());
    }
}