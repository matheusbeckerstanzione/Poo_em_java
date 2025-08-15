

public class Main {
    public static void main(String[] args) {

        // PRODUTOS

        //tipo nome = new tipo();
        Produto prod1 = new Produto("Monitor",800, "dell" );
                        //INSTANCIAR A CLASSE


        prod1.mostrarInformacoes();


      Carro carro1 = new Carro("Fiat", "Argo", "Carro do ano modelo branco");

      carro1.marca = "Fiat";
      carro1.modelo = "Argo";
        carro1.descricao = "Carro do ano modelo branco";



        carro1.mostrarInformacoes();



        Musica musica1 = new Musica("Piu piu e frajola", 280, "Orochi");

       musica1.mostrarInformacoes();

        Aluno aluno1 = new Aluno("Joao", 8.5);
        aluno1.nome = "joao";
        aluno1.nota = 8.5;

        aluno1.mostrarInformacoes();

    }
    }



