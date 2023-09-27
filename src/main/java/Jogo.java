import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private List<Personagem> personagens = new ArrayList<>();

    public void adicionarPersonagem(String nomePersonagem, String nomeArma, int dano) {
        Arma arma = ArmaFactory.getArma(nomeArma, dano);
        Personagem personagem = new Personagem(nomePersonagem, arma);
        personagens.add(personagem);
    }

    public List<String> obterPersonagens() {
        List<String> saida = new ArrayList<String>();
        for (Personagem personagem : this.personagens) {
            saida.add(personagem.obterPersonagem());
        }
        return saida;
    }
}
