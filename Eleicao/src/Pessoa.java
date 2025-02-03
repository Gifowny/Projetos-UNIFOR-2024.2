import java.util.HashSet;

public class Pessoa implements Votavel{
    String nome;
    protected String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    @Override
    public String getNome() {
        return nome;
    }

    @Override
   public void setNome(String nome) {
        this.nome = nome;
    }
}
