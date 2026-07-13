package model;

public class Veiculo {

    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String placa;
    private int quilometragem;



public Veiculo(String marca, String modelo, int anoFabricacao, String placa, int quilometragem) {

    this.marca = marca;
    this.modelo = modelo;
    this.anoFabricacao = anoFabricacao;
    this.placa = placa;
    this.quilometragem = quilometragem;

}

    @Override
    public String toString() {
        return String.format(
            "Veiculo: %s %s (%d) - Placa %s - %d km",
            marca, modelo, anoFabricacao, placa, quilometragem
        );
    }
}