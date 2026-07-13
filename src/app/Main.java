package app;

import model.Veiculo;

public class Main {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("        AutoZelo v0.1");
        System.out.println("==================================");
 
          Veiculo meuCarro = new Veiculo(
                "Chevrolet",
                "Corsa Millennium",
                2001,
                "KNS-1977",
                144000
        );

        System.out.println(meuCarro);

    }

}