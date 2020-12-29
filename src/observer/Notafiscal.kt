package observer

import model.ItemDaNota
import java.util.*

class Notafiscal(
        val razaoSocial: String?,
        val cnpj: String?,
        val calendar: Calendar?,
        val valorBruto: Double?,
        val imposto: Double?,
        val itens: List<ItemDaNota>?,
        val observacoes: String?
) {
}