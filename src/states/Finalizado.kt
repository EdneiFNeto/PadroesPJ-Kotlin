package states

import model.Orcamento
import java.lang.RuntimeException

class Finalizado : EstadoOrcamento {
    override fun aplicaDescontoExtra(orcamento: Orcamento) {
        throw  RuntimeException("Finalizado")
    }

    override fun aprovar(orcamento: Orcamento) {
        throw  RuntimeException("Orcamento finalizado")
    }

    override fun reprovar(orcamento: Orcamento) {
        throw  RuntimeException("Orcamento finalizado")
    }

    override fun finalizar(orcamento: Orcamento) {
        throw  RuntimeException("Orcamento finalizado")
    }
}
