public class áudio {
    String titulo;
    private   int duraçao;
    private double totaldereproduçoes;
    private int curtidas;
    private int classificaçao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuraçao() {
        return duraçao;
    }

    public void setDuraçao(int duraçao) {
        this.duraçao = duraçao;
    }

    public double getTotaldereproduçoes() {
        return totaldereproduçoes;
    }

    public void setTotaldereproduçoes(double totaldereproduçoes) {
        this.totaldereproduçoes = totaldereproduçoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificaçao() {
        return classificaçao;
    }

    public void setClassificaçao(int classificaçao) {
        this.classificaçao = classificaçao;
    }

    public void ReproduzirMusica(){
        System.out.println("O nome da musica é: " +titulo);
        System.out.println("Duração total de "+duraçao+" minutos");
        this.totaldereproduçoes++;
        System.out.println("O total de reproduções é: " +totaldereproduçoes);

    }

    public void ReproduzirPodCast(){
        System.out.println("\nO Titulo do Podcast é: " +titulo);
        System.out.println("A classificação desse PodCast é de: " +classificaçao +" estrelas ");
        System.out.println("Duração total de "+duraçao+" minutos");
        this.totaldereproduçoes++;
        System.out.println("O total de vezes reproduzidas é: "+ totaldereproduçoes);

    }



    public void curtir(){
        this.curtidas++;
        System.out.println("\nO numero de curtidas dessa musica é: " +curtidas);

    }

    public void curtirpodcast(){
        this.curtidas++;
        System.out.println("O numero de curtidas desse podcast é: " +curtidas);
    }


}
