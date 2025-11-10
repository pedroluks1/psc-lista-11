
public class SistemaVeiculos {

    
    public static abstract class Veiculo {
        protected String marca;
        protected String modelo;
        protected int ano;

        public Veiculo(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
        }

        public void exibirDetalhes() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
        }

        public abstract void acelerar();
    }

   
    public static class Carro extends Veiculo {
        private double tempoAceleracao;

        public Carro(String marca, String modelo, int ano, double tempoAceleracao) {
            super(marca, modelo, ano);
            this.tempoAceleracao = tempoAceleracao;
        }

        
        public void acelerar() {
            System.out.println(modelo + " " + marca + " está acelerando de 0 a 100 km/h em " 
                               + tempoAceleracao + " segundos.");
        }
    }

    
    public static class Moto extends Veiculo {

        public Moto(String marca, String modelo, int ano) {
            super(marca, modelo, ano);
        }

        
        public void acelerar() {
            System.out.println(modelo + " " + marca + " está acelerando e empinando a roda dianteira!");
        }
    }

   
    public static class Caminhao extends Veiculo {

        public Caminhao(String marca, String modelo, int ano) {
            super(marca, modelo, ano);
        }

        
        public void acelerar() {
            System.out.println(modelo + " " + marca + " está engrenando a próxima marcha e acelerando lentamente.");
        }
    }

    
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla", 2022, 8.5);
        Veiculo moto = new Moto("Honda", "CB 500", 2023);
        Veiculo caminhao = new Caminhao("Volvo", "FH16", 2021);

        System.out.println("=== Detalhes do Carro ===");
        carro.exibirDetalhes();
        carro.acelerar();

        System.out.println("\n=== Detalhes da Moto ===");
        moto.exibirDetalhes();
        moto.acelerar();

        System.out.println("\n=== Detalhes do Caminhão ===");
        caminhao.exibirDetalhes();
        caminhao.acelerar();
    }
}
