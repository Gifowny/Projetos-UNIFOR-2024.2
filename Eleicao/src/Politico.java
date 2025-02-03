class Politico extends Pessoa implements Votavel{

         private int numero; // Número do político
         private String nome; // Nome do político
         private int votos; // Contador de votos

        public Politico(int numero, String nome) {
                this.numero = numero;
                this.nome = nome;
                this.votos = 0; // Inicializa com zero votos
        }

         @Override
         public void registrarVoto() {
                 votos++;
         }

         @Override
         public int getVotos() {
                 return votos;
         }

         @Override
         public int getNumero() {
                 return numero;
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