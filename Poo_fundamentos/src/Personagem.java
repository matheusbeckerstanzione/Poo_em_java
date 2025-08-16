public class Personagem {

    private String nome;
    private double nivel;
    private double PontosDeVida;

    public Personagem(String nome, double nivel, double pontosDeVida)
    {
        this.nome = nome;
        this.nivel = nivel;
        this.PontosDeVida = pontosDeVida;

    }

    public String getNome() {
        return nome;
    }

    public double getNivel() {
        return nivel;
    }

    public double getPontosDeVida() {
        return PontosDeVida;
    }

    public void receberDano(int dano){

        this.PontosDeVida -= dano;
        if (this.PontosDeVida < 0) {
            this.PontosDeVida = 0;
        }

    }

    }

