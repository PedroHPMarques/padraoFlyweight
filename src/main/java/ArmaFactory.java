import java.util.HashMap;
import java.util.Map;

public class ArmaFactory {
    private static Map<String, Arma> armas = new HashMap<>();

    public static Arma getArma(String nome, int dano) {
        Arma arma = armas.get(nome);
        if (arma == null) {
            arma = new Arma(nome, dano);
            armas.put(nome, arma);
        }
        return arma;
    }

    public static int getTotalArmas() {
        return armas.size();
    }
}
