package Program;

import Entities.Bicicleta;
import Entities.Carro;
import Entities.Veiculo;

public class ProgramVeiculo {
    public static void main(String[] args) {
      Veiculo[] veiculo ={new Carro(), new Bicicleta()};

       for (Veiculo veiculos: veiculo){
           veiculos.mover();
       }


    }
}
