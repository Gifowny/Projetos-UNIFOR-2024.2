import java.util.ArrayList;
import java.util.List;
public class ZonaEleitoral {
    private int numero;
    private List<SecaoEleitoral> secoes;

    public ZonaEleitoral(int numero) {
        this.numero = numero;
        this.secoes = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            secoes.add(new SecaoEleitoral(i));
        }
    }

    public int getNumero() {
        return numero;
    }

    public List<SecaoEleitoral> getSecoes() {
        return secoes;
    }
}