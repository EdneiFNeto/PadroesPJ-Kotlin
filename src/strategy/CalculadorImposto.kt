package strategy

import model.Orcamento

class CalculadorImposto {
    fun calucarImposto(orcamento: Orcamento,
                       imposto: Imposto) = imposto.calcula(orcamento)

}