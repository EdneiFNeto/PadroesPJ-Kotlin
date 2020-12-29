package states

import model.Orcamento
import java.lang.RuntimeException

class EmAprovacao : EstadoOrcamento {
    override fun aplicaDescontoExtra(orcamento: Orcamento) {
        orcamento.valor = orcamento.valor ?: 0.0 * 0.05
    }

    override fun aprovar(orcamento: Orcamento) {
        orcamento.estadoAtual = Aprovado()
    }

    override fun reprovar(orcamento: Orcamento) {
        orcamento.estadoAtual = Reprovado()
    }

    override fun finalizar(orcamento: Orcamento) {
        throw RuntimeException("Orcamento em  aprovacao nao pode ir direto para finalizado")
    }
}
