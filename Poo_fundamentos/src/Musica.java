public class Musica {

    public String titulo;
    public String artista;
    public double duracaoEmSegundos;

    public  Musica(String titulo, double duracaoEmSegundos, String artista){
        this.titulo = titulo;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.artista= artista;

    }
    public void  mostrarInformacoes(){
        System.out.println("Nome " + titulo);
        System.out.println("Duração em segundos  " + duracaoEmSegundos);
        System.out.println("Artista " + artista);
    }
    }