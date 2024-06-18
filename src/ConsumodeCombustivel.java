public class ConsumodeCombustivel {
    public static void main(String[] args) {
        // Dados de entrada
        String modeloDoCarro = "Ford Fiesta";
        byte autonomiaDoVeiculo = 11;
        short distanciaPercorridaEmKm = 350;
        double valorDoCombustivelEmReais = 5.78;
        // Processamento dos dados - calcular
        double quantidadeDeCombustivelUtilizado = (distanciaPercorridaEmKm / autonomiaDoVeiculo);
        double totalGastoComAViagem = quantidadeDeCombustivelUtilizado * valorDoCombustivelEmReais;
        // Processamento dos dados resultado para o usuario
        System.out.println("----------------------------------------");
        System.out.println("        CONSUMO DE COMBUSTIVEL"          );
        System.out.println("----------------------------------------");
              System.out.println("Modelo do carro? " + modeloDoCarro);
              System.out.println("Autonomia do carro?" + autonomiaDoVeiculo);
              System.out.println("Distância da viagem?" + distanciaPercorridaEmKm);
              System.out.println("Valor do combustível? " + valorDoCombustivelEmReais);
        System.out.println("----------------------------------------");
        System.out.println("              RESULTADO"                 );
        System.out.println("----------------------------------------");
              System.out.println("Modelo do carro: " + modeloDoCarro);
              System.out.println("Autonomia do carro:" + autonomiaDoVeiculo + "Km/l");
              System.out.println("Distância da viagem:" + distanciaPercorridaEmKm + "Km");
              System.out.println("Valor do combustível: " + "R$" + valorDoCombustivelEmReais);
              System.out.println("----------------------------------------");
        System.out.println("Quantidade de combustíel utilizado: " + distanciaPercorridaEmKm / autonomiaDoVeiculo);
        System.out.println("Total gasto com a viagem: " + "R$" + (distanciaPercorridaEmKm / autonomiaDoVeiculo) * valorDoCombustivelEmReais);
        System.out.println("----------------------------------------");
    }
}
