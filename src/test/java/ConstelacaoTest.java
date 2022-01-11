import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

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

        assertEquals("saida", constelacao.obterConstelacao());
    }
}