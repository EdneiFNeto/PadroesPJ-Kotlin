package chainOfResponsability

import model.Orcamento

class DescontoPorCincoItens: Desconto {
    private var proximo: Desconto?=null

    override fun desconto(orcamento: Orcamento): Double {
        return if(orcamento.getItens().size > 5){
            orcamento.valor?:0 * 0.1
        } else {
            proximo?.desconto(orcamento)?:0.0
        }
    }

    override fun proximoDesconto(desconto: Desconto) {
        proximo = desconto
    }
}