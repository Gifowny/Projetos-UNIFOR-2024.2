public interface Votavel {
    void registrarVoto();
    int getVotos(); // Retorna o total de votos
    int getNumero(); // Retorna o número do votável
    String getNome();
    void setNome(String nome);
 }
