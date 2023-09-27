public class Personagem {
    private String nome;
    private Arma tipoArma;

    public Personagem(String nome, Arma tipoArma) {
        this.nome = nome;
        this.tipoArma = tipoArma;
    }

    public String obterPersonagem() {
        return "Personagem{" +
                "nome='" + this.nome + '\'' +
                ", arma='" + tipoArma.getNome() + '\'' +
                ", dano='" + tipoArma.getDano() + '\'' +
                '}';
    }
}
