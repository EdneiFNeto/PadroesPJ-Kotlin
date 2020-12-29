package states

import model.Orcamento

interface EstadoOrcamento {
    fun aplicaDescontoExtra(orcamento: Orcamento)
    fun aprovar(orcamento: Orcamento)
    fun reprovar(orcamento: Orcamento)
    fun finalizar(orcamento: Orcamento)
}
