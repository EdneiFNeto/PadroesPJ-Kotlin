package strategy

import model.Orcamento

class ICMS : Imposto {
    override fun calcula(orcamento: Orcamento): Double? {
        return orcamento.valor ?: 0.0 * 0.1
    }
}