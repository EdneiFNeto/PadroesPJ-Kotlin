import memento.Contrato
import memento.Historico
import memento.TipoContrato
import model.*
import observer.EnviaPorEmail
import observer.NotaFiscalBuilder
import observer.SalvaNoBanco
import padroes_pj_2.flyweight.NotasMusicais
import padroes_pj_2.flyweight.model.Nota
import padroes_pj_2.flyweight.model.Piano
import strategy.ICMS
import strategy.ISS
import java.util.*
import kotlin.collections.ArrayList

var tamPapel = 30

fun main() {
}

private fun memento() {
    var historico = Historico()

    var contrato = Contrato(Calendar.getInstance(), "Ed", TipoContrato.NOVO)
    contrato.avanca()
    historico.adiciona(contrato.salvaEstado())

    contrato.avanca()
    historico.adiciona(contrato.salvaEstado())

    var estadoAnteriro = historico.pega(1)
    println("estadoAnteriro ${estadoAnteriro.contrato.tipo}")
}

private fun flyweight() {
    var notas = NotasMusicais()
    var musica = listOf(
            notas.get("do"),
            notas.get("re"),
            notas.get("mi"),
            notas.get("fa"),
            notas.get("fa")
    )
    var piano = Piano()
    piano.tocar(musica as List<Nota>)
    println("musicas $musica")
}

private fun obServer() {
    var builder = builder()
    builder.adicionarAcao(EnviaPorEmail())
    builder.adicionarAcao(SalvaNoBanco())
    var notaFiscal = builder.notaFiscal()

    print("Valor ${notaFiscal.valorBruto}")
}

private fun builder(): NotaFiscalBuilder {
    return NotaFiscalBuilder()
            .paraempresa("Nome da empresa")
            .comCNPJ("000000/0000-1")
            .comItens(ItemDaNota("item 1", 200.0))
            .comItens(ItemDaNota("item 1", 200.0))
            .comItens(ItemDaNota("item 1", 200.0))
            .observacoes("Obsevacoes")
            .naDataAtual()

}

private fun templateMetod() {
    var iss = ISS()
    var icms = ICMS()

    var orcamento = Orcamento(500.0)
    var calcula = iss.calcula(orcamento)
    var calcula2 = icms.calcula(orcamento)
}

private fun states(orcamento: Orcamento) {
    orcamento.aplicaDescontoExtra()
    orcamento.aprova()
    orcamento.aplicaDescontoExtra()
    print("Valor ${orcamento.valor}")
    orcamento.finaliza()
    orcamento.aplicaDescontoExtra()
}

private fun numerosAleatorios() {
    var take = (0..40).shuffled().take(30) as ArrayList
    take.sort()
    print("$take")
}


fun desenhaLinha(nome: String, valor: String, caracter: String): String? {

    var linha = StringBuilder()
    val diferenca = nome.length + valor.length

    if (tamPapel < diferenca)
        throw Exception("Valor incorreto")

    var total = tamPapel - diferenca

    for (i in 0 until total)
        linha.append("$caracter")

    return "$nome${linha}$valor"
}