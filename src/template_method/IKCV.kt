package template_method

import chainOfResponsability.Item
import model.Orcamento
import strategy.Imposto

class IKCV : TempleteImpostoCondicional() {


    private fun temItemMaiorQue100Reais(orcamento: Orcamento): Boolean {
        var find = orcamento.getItens().find { it.valor ?: 0.0 > 100 }
        var valor = find?.valor
        return valor ?: 0.0 > 100
    }

    override fun maximaTaxacao(orcamento: Orcamento): Double? {
        return orcamento.valor?:0.0 * 0.06
    }

    override fun minimaTaxacao(orcamento: Orcamento): Double? {
        return orcamento.valor?:0.0 * 0.10
    }

    override fun deveUsarMaximaTaxacao(orcamento: Orcamento): Boolean {
        return orcamento.valor?:0.0 > 500 && temItemMaiorQue100Reais(orcamento)
    }
}