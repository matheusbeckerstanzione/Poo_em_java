public class Carro {



    public String marca;
    public String modelo;
    public String descricao;

    public Carro(String nome, String modelo, String descricao){
        this.marca = nome;
        this.modelo = modelo;
        this.descricao= descricao;

    }

    public void mostrarInformacoes(){
        System.out.println("Marca " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Descricao " + descricao);



    }
}

