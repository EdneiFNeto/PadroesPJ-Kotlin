import model.*
import observer.EnviaPorEmail
import observer.NotaFiscalBuilder
import observer.SalvaNoBanco
import strategy.ICMS
import strategy.ISS

var tamPapel = 30

fun main() {

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