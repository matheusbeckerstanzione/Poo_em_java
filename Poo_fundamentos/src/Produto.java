    //public class NOme da class {}
    public class Produto {
        // 1. atributos - pensar oq ela vai ter de atributos

        // 2. metodo

        //todo atributo vai começar com a palavra public class

       public String nome; // o produto tem um nome
        public double tamanho;
        public double preco;
        public String cor;
        public int unidade;
        public String marca;

        //2. metodo

        public  Produto(String nome, double preco, String marca){
            this.nome = nome;
            this.preco = preco;
            this.marca= nome;

        }




        //mostrar irformacao do produto

        public void  mostrarInformacoes(){
            System.out.println("Nome " + nome);
            System.out.println("Preco " + preco);
            System.out.println("Marca" + marca);

        }
        }
