

public class Main {
    public static void main(String[] args) {

        // PRODUTOS

        //tipo nome = new tipo();
        Produto prod1 = new Produto();
                        //INSTANCIAR A CLASSE
        prod1.nome = "monitor";
        prod1.preco = 850.00;
        prod1.marca = " Dell";

        prod1.mostrarInformacoes();

        Produto prod2 = new Produto();
        prod2.nome = "Notebook";
        prod2.preco = 2000.00;
        prod2.marca = "Dell";
      Carro carro1 = new Carro();

      carro1.nome = "Fiat";
      carro1.modelo = "Argo";
        carro1.descricao = "Carro do ano modelo branco";

        Carro carro2 = new Carro();
        carro2.nome = "Ferrari";
        carro2.modelo = "Ferrari F8";
        carro2.descricao = "Uma Ferrari branca neve";

        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();


        Musica musica1 = new Musica();
        musica1.titulo = "Piu piu e frajola";
        musica1.artista = "Orochi";
        musica1.duracaoEmSegundos = 260;
        System.out.println(musica1.titulo);
        System.out.println(musica1.artista);
        System.out.println(musica1.duracaoEmSegundos);

        Aluno aluno1 = new Aluno();
        aluno1.nome = "joao";
        aluno1.nota = 8.5;

        aluno1.mostrarInformacoes();

    }
    }



