public class Main extends áudio {
    public static void main(String[] args) {


        Musica musica = new Musica();
        musica.setTitulo("camisa 10");
        musica.setDuraçao(3);
        musica.setAlbum("Turma do pagode");
        musica.setArtista("Charles André");
        musica.setGenero("Masculino");
        for (int i = 0; i < 1000; i++) {
            musica.ReproduzirMusica();
        }
        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }


        Musica musica2 = new Musica();
        musica2.setTitulo("Céu Azul");
        musica2.setDuraçao(3);
        musica2.setAlbum("Charlie Brown");
        musica2.setArtista("Chorão");
        musica2.setGenero("Masculino");

        for (int i = 0; i < 1000; i++) {
            musica2.ReproduzirMusica();
        }

        for (int i = 0; i < 50; i++) {
            musica2.curtir();
        }



        PodCast podCast = new PodCast();

        podCast.setTitulo("PÉRICLES CANTA CLÁSSICOS AO VIVO NO PODPAH");
        podCast.setHost("Igão e Mítico");
        podCast.setDuraçao(11);
        podCast.setClassificaçao(5);

        for (int i = 0; i < 1000; i++) {
            podCast.ReproduzirPodCast();
        }
        for (int i = 0; i < 1000 ; i++) {
            podCast.curtirpodcast();
        }



        PodCast podCast2 = new PodCast();

        podCast2.setTitulo("VEIGH - Podpah #963");
        podCast2.setHost("Igão e Mítico ");
        podCast2.setDuraçao(134);
        podCast2.setClassificaçao(5);

        for (int i = 0; i < 1000; i++) {
            podCast2.ReproduzirPodCast();
        }
        for (int i = 0; i < 1000 ; i++) {
           podCast2.curtirpodcast();
        }

    }
}