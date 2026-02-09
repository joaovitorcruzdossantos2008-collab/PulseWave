public class Musica extends áudio {
private String album;
private String artista;
private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public void ReproduzirMusica(){
        super.ReproduzirMusica();
        System.out.println("O nome do artista é: " +artista);
        System.out.println("O genero do artista é: " +genero);
        System.out.println("O nome do album é: " +album);
    }

}
