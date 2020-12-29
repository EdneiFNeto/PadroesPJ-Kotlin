package states

import model.Orcamento
import java.lang.RuntimeException

class Aprovado: EstadoOrcamento {
    override fun aplicaDescontoExtra(orcamento: Orcamento) {
        orcamento?.valor = orcamento.valor?:0.0 * 0.02
    }

    override fun aprovar(orcamento: Orcamento) {
        throw RuntimeException("Orcamento já aprovado!")
    }

    override fun reprovar(orcamento: Orcamento) {
        throw RuntimeException("Orcamento aprovado nao pode ser reprovado!")
    }

    override fun finalizar(orcamento: Orcamento) {
        orcamento.estadoAtual = Finalizado()
    }

}
