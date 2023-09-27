import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class jogoTest {
    @Test
    void deveRetornarPersonagens() {
        Jogo jogo = new Jogo();
        jogo.adicionarPersonagem("Scorpion", "Kunai", 90);
        jogo.adicionarPersonagem("Sub-Zero", "Espada de Gelo", 85);
        jogo.adicionarPersonagem("Raiden", "Cajado Elétrico", 95);
        jogo.adicionarPersonagem("Liu Kang", "Punhos de Fogo", 88);

        List<String> saida = Arrays.asList(
                "Personagem{nome='Scorpion', arma='Kunai', dano='90'}",
                "Personagem{nome='Sub-Zero', arma='Espada de Gelo', dano='85'}",
                "Personagem{nome='Raiden', arma='Cajado Elétrico', dano='95'}",
                "Personagem{nome='Liu Kang', arma='Punhos de Fogo', dano='88'}");

        assertEquals(saida, jogo.obterPersonagens());
    }

    @Test
    void deveRetornarTotalArmas() {
        Jogo jogo = new Jogo();
        jogo.adicionarPersonagem("Scorpion", "Kunai", 90);
        jogo.adicionarPersonagem("Sub-Zero", "Espada de Gelo", 85);
        jogo.adicionarPersonagem("Raiden", "Cajado Elétrico", 95);
        jogo.adicionarPersonagem("Liu Kang", "Punhos de Fogo", 88);

        assertEquals(4, ArmaFactory.getTotalArmas());
    }

}