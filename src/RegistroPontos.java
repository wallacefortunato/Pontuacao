public class RegistroPontos {

    public void fazerUmComentario (Usuario usuario){
        usuario.pontos += 3;
    }

    public void criarUmTopico (Usuario usuario){
        usuario.pontos += 5;
    }

    public void darUmLike (Usuario usuario){
        usuario.pontos += 1;
    }
}
