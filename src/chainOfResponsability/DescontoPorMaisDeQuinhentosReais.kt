package chainOfResponsability

import model.Orcamento

class DescontoPorMaisDeQuinhentosReais : Desconto {

    private var proximo: Desconto? = null

    override fun desconto(orcamento: Orcamento): Double {
        return if (orcamento.valor ?: 0.0 > 500) {
            orcamento.valor ?: 0.0 * 0.1
        } else {
            0.0
        }
    }


    override fun proximoDesconto(desconto: Desconto) {
        proximo = desconto
    }
}
