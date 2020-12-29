package strategy

import model.Orcamento

interface Imposto {
    fun calcula(orcamento: Orcamento): Double?
}