public class Carroo extends Veiculo{
    private String nome;

    public Carroo(String nome, int numero){
        super(nome);
        this.numero();
    }
    public String nome(){
        return nome();
    }

    @Override
    public int numero() {
        return super.numero();
    }
}
