package states

import model.Orcamento
import java.lang.RuntimeException

class Reprovado: EstadoOrcamento {
    override fun aplicaDescontoExtra(orcamento: Orcamento) {
        throw  RuntimeException("Nao pode aplicar desconto")
    }

    override fun aprovar(orcamento: Orcamento) {
        throw  RuntimeException("Orcamento  reprovado nao pode ser  aprovados!")
    }

    override fun reprovar(orcamento: Orcamento) {
        throw  RuntimeException("Orcamento  já esta reprovado!")
    }

    override fun finalizar(orcamento: Orcamento) {
        orcamento.estadoAtual = Finalizado()
    }
}
