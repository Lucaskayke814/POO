public class Publicacao extends  RedeSocial{

    public Publicacao(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        super(dataCriacao, nomeUsuario, dataNascimento, senha);
    }
    public String dataPublicacao;
    public String textoPublicacao;
    public String linkMedia;

    public static double contadorPublicacao;

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public void setLinkMedia(String linkMedia) {
        this.linkMedia = linkMedia;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public String getLinkMedia() {
        return linkMedia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }
}
