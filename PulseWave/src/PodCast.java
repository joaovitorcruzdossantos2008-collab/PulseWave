public class PodCast extends áudio{
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void ReproduzirPodCast() {
        super.ReproduzirPodCast();
        System.out.println("Os hosts do PodCast são: " + host);
    }
}

