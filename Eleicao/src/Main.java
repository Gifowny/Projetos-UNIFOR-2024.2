import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            List<ZonaEleitoral> zonas = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                zonas.add(new ZonaEleitoral(i));
            }
            try {
                System.out.print("Informe sua Zona Eleitoral (1 a 5): ");
                int zonaEscolhida = sc.nextInt();

                System.out.print("Informe sua Seção Eleitoral (1 a 5): ");
                int secaoEscolhida = sc.nextInt();

                // Validando a zona e seção
                if (zonaEscolhida < 1 || zonaEscolhida > 5) {
                    System.out.println("Zona Eleitoral inválida!");
                    return;
                }
                if (secaoEscolhida < 1 || secaoEscolhida > 5) {
                    System.out.println("Seção Eleitoral inválida!");
                    return;
                }

                try {
                    System.out.println("Bem vindo as eleições 2024! por favor, vote conscientemente! Lembre-se que o voto é secreto");
                    System.out.println("digite seu nome:");
                    Pessoa p = new Pessoa();
                    p.setNome(sc.next());
                    System.out.println("Digite seu cpf:");
                    p.setCpf(sc.next());
                    System.out.println("Seja bem vindo Sr(a)" + p.getNome() + ", CPF :" + p.getCpf() + ", da zona eleitoral: " + zonaEscolhida + ", e secao eleitoral: " + secaoEscolhida);
                    System.out.println("Insira a seguir seu voto ( para mais info. sobre os candidatos, digite 00):");
                    if (sc.nextInt() == 00) {
                        System.out.println("andré fernandes (PL/22) // Capitão Wagner (União/44)// Evandro Leitão (PT/13)// José Sarto (PDT/12)");
                        System.out.println("Digite o numero do seu politico");
                    }
                    Urna U = new Urna();
                    try {
                        U.registrarVoto(sc.nextInt());

                    } catch (NumeroPoliticoInvalidoException e) {
                        System.out.println("Erro ao registrar voto: " + e.getMessage());

                    }
                    try {
                        System.out.println("Digite 1 para ver os votos e 0 para prosseguir");
                        if (sc.nextInt() == 1) {
                            U.exibirVotos();
                        }
                    } catch (InputInvalidoException e) {
                        throw new InputInvalidoException("Erro ao verificar votos: " + e.getMessage());
                    }
                    // Salvando os resultados em arquivo
                    System.out.print("\nDeseja salvar os resultados em um arquivo? (S/N): ");
                    String salvar = sc.next();
                    if (salvar.equalsIgnoreCase("S")) {
                        System.out.print("Informe o nome do arquivo (ex: resultados.txt): ");
                        String nomeArquivo = sc.next();
                        U.salvarResultadosEmArquivo(nomeArquivo);


                    }
                } catch (InputInvalidoException e) {
                    System.out.println("Erro: Entrada inválida!");
                }
                System.out.print("Deseja votar novamente? (S/N): ");
                String resposta = sc.next();
                continuar = resposta.equalsIgnoreCase("S");
            } catch (InputInvalidoException e) {


            }
        }
    }
}
