public class Vereador extends Politico implements Votavel {
     private String areaAtuacao;

    public Vereador(int numero, String nome) {
        super(numero, nome);
    }

    @Override
    public void registrarVoto() {

    }

    @Override
    public int getVotos() {
        return 0;
    }

    @Override
    public int getNumero() {
        return 0;
    }
}