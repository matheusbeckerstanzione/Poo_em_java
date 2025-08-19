

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



            Personagem heroi = new Personagem("matheus", 22,100);


            System.out.println("Nome " + heroi.getNome());
            System.out.println("Nível " + heroi.getNivel());
            System.out.println("Pontos de Vida " + heroi.getPontosDeVida());


            heroi.receberDano(30);
            System.out.println("Vida após dano " + heroi.getPontosDeVida());


            heroi.receberDano(80);
            System.out.println("Vida após dano " + heroi.getPontosDeVida());

            Atleta atleta = new Atleta("Matheus", "Futebol");
            System.out.println("Nome" + atleta.getNome());
            System.out.println("Esporte" + atleta.getNome());

            Carroo carroo = new Carroo("Fiat", 4);
            Bicicleta bicicleta = new Bicicleta("Caloi", 2);

        System.out.println("Nome" + carroo.nome());
        System.out.println("Numero de portas" + carroo.numero());

        System.out.println("Nome" + bicicleta.Nome());
        System.out.println("Numero de rodas" + bicicleta.numero());

    }
    }




