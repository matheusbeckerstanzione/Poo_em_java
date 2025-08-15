public class Aluno {



    public String nome;
    public double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;


    }
    public void mostrarInformacoes(){

      if (nota >= 7) {

          System.out.println("Aprovado " + nome);
      }


      else {
          System.out.println("Reprovado");

      }
    }
}



