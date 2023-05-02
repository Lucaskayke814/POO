import java.util.ArrayList;

public class RedeSocial {

    public String dataCriacao;
    public String nomeUsuario;
    public String dataNascimento;
    public String senha;

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }
    ArrayList<Publicacao> publicacoes = new ArrayList<> ();

    public void imprimePublicacao(){}
}
