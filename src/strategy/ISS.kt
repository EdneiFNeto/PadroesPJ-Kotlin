package strategy

import model.Orcamento

class ISS : Imposto {
    override fun calcula(orcamento: Orcamento): Double? {
        return orcamento.valor ?: 0.0 * 0.6
    }
}