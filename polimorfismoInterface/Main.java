public class Main {
    public static void main(String[] args) {
        // Criando um array de IMeioTransporte com diferentes tipos de transportes
        IMeioTransporte[] transportes = new IMeioTransporte[3];
        transportes[0] = new Carro();
        transportes[1] = new Bicicleta();
        transportes[2] = new Trem();

        // Percorrendo o array e chamando os métodos acelerar e frear
        for (IMeioTransporte transporte : transportes) {
            transporte.acelerar();
            transporte.frear();
            System.out.println(); 
        }
    }
}
