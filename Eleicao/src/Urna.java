import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class Urna {
    private HashMap<Integer, Votavel> politicos;
    public Urna() {
        politicos = new HashMap<>();
        adicionarPoliticos(new Politico(22, "André Fernandes"));
        adicionarPoliticos(new Politico(13,"Evandro Leitão "));
        adicionarPoliticos(new Politico(45, "Capitão Wagner"));
        adicionarPoliticos(new Politico(12,"José Sarto"));
    }


    public void adicionarPoliticos(Votavel votavel) {
        politicos.put(votavel.getNumero(), votavel);
    }

    public void registrarVoto(int numeroPolitico) throws NumeroPoliticoInvalidoException {
        Votavel votavel = politicos.get(numeroPolitico);
        if (votavel == null) {
            throw new NumeroPoliticoInvalidoException("Número de votável inválido: " + numeroPolitico);
        }
        votavel.registrarVoto();
        System.out.println("Voto registrado para: " + votavel.getNome());
    }
    public void exibirVotos() {
        System.out.println("Contagem de votos:");
        for (Votavel votavel : politicos.values()) {
            System.out.println("Número: " + votavel.getNumero() + " - Nome: " + votavel.getNome() + " - Votos: " + votavel.getVotos());
        }
    }
    public void salvarResultadosEmArquivo(String nomeArquivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            writer.println("Resultados da Urna:");
            for (Votavel votavel : politicos.values()) {
                writer.printf("Número: %d, Nome: %s, Votos: %d%n",
                        votavel.getNumero(), votavel.getNome(), votavel.getVotos());
            }
            System.out.println("Resultados salvos em: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar resultados: " + e.getMessage());
        }
    }
}

