public class SecaoEleitoral {
    private int numero;
    private Urna urna;

    public SecaoEleitoral(int numero) {
        this.numero = numero;
        this.urna = new Urna();
    }

    public int getNumero() {
        return numero;
    }

    public Urna getUrna() {
        return urna;
    }
}