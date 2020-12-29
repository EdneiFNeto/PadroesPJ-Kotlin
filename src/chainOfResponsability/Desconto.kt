package chainOfResponsability

import model.Orcamento

interface Desconto {
    fun desconto(orcamento: Orcamento): Double
    fun proximoDesconto(desconto: Desconto)
}