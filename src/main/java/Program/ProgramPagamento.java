package Program;

import Entities.Pagamento;
import Entities.PagamentoCartao;
import Entities.PagamentoDinheiro;

public class ProgramPagamento {
    public static void main(String[] args) {
        Pagamento [] pagamento= {new PagamentoCartao(), new PagamentoDinheiro()};
        for (Pagamento pagamentos: pagamento){
            pagamentos.realizarPagamento();
        }
    }
}
