package template_method

import model.Orcamento

class ICPP : TempleteImpostoCondicional() {

    override fun maximaTaxacao(orcamento: Orcamento): Double? {
        return orcamento.valor?:0.0 * 0.05
    }

    override fun minimaTaxacao(orcamento: Orcamento): Double? {
        return orcamento.valor?:0.0 * 0.7
    }

    override fun deveUsarMaximaTaxacao(orcamento: Orcamento): Boolean {
        return orcamento.valor?:0.0 > 500
    }
}