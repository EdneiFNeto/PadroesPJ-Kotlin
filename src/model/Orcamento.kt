package model

import chainOfResponsability.Item
import states.EmAprovacao
import states.EstadoOrcamento
import java.util.*
import kotlin.collections.ArrayList

class Orcamento(var valor:Double?) {
    var estadoAtual: EstadoOrcamento? = EmAprovacao()
    private val itens = ArrayList<Item>()

    fun addItem(item: Item) {
        itens.add(item)
    }

    fun getItens(): MutableList<Item> = Collections.unmodifiableList(itens)

    /**
     * states
     */
    fun aplicaDescontoExtra() {
        estadoAtual?.aplicaDescontoExtra(this)
    }

    fun aprova() {
        estadoAtual?.aprovar(this)
    }

    fun reprova() {
        estadoAtual?.reprovar(this)
    }

    fun finaliza() {
        estadoAtual?.finalizar(this)
    }
}