package Program;

import Entities.Desenvovedor;
import Entities.Funcionario;
import Entities.Gerente;

public class ProgramFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Fulano",15000);
        Gerente gerente = new Gerente("Ciclano",1200,1000);
        Desenvovedor desenvovedor = new Desenvovedor("Beltrano",3000);
        System.out.println(funcionario.calcularSalario());
        System.out.println(gerente.calcularSalario());
        System.out.println(desenvovedor.calcularSalario());
    }
}
