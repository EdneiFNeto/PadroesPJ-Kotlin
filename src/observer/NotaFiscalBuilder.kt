package observer

import model.ItemDaNota
import java.util.*
import kotlin.collections.ArrayList

class NotaFiscalBuilder {

    private var data: Calendar?=null
    private var valorBruto: Double=0.0
    private var imposto: Double=0.0
    private val itens = ArrayList<ItemDaNota>()
    private var razaoSocial: String? = null
    private var observacoes: String? = null
    private var acoesAserExecutadas = ArrayList<Observer>()
    var cnpj: String? = null

    fun paraempresa(s: String?): NotaFiscalBuilder {
        this.razaoSocial = s
        return this
    }

    fun comCNPJ(cnpj: String): NotaFiscalBuilder {
        this.cnpj = cnpj
        return this
    }

    fun comItens(itemDaNota: ItemDaNota): NotaFiscalBuilder {
        itens.add(itemDaNota)
        valorBruto += itemDaNota.valor
        imposto += itemDaNota.valor * 0.05
        return this
    }

    fun observacoes(s: String?): NotaFiscalBuilder {
        this.observacoes = s
        return this
    }

    fun  naDataAtual(): NotaFiscalBuilder {
        this.data = Calendar.getInstance()
        return this
    }

    fun adicionarAcao(acaoAposGerarNota: Observer){
        this.acoesAserExecutadas.add(acaoAposGerarNota)
    }

    fun notaFiscal(): Notafiscal {
        var nf = Notafiscal(razaoSocial = razaoSocial, cnpj = cnpj, calendar = data, valorBruto = valorBruto,
                observacoes = observacoes, imposto = imposto, itens = itens)

        for( acaoAposGerarNota in acoesAserExecutadas){
            acaoAposGerarNota.executa(nf)
        }

        return nf
    }
}
