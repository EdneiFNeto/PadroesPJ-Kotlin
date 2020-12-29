package template_method

import model.Orcamento

abstract class TempleteImpostoCondicional {
    abstract fun maximaTaxacao(orcamento: Orcamento): Double?
    abstract fun minimaTaxacao(orcamento: Orcamento): Double?
    abstract fun deveUsarMaximaTaxacao(orcamento: Orcamento): Boolean
}
