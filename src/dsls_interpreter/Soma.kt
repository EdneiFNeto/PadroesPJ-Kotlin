package dsls_interpreter

class Soma(var diretia: Expressao, var esquerda: Expressao) : Expressao {
    override fun avalia(): Int {
        var valorDireita = diretia.avalia()
        var valorEsquerda = esquerda.avalia()
        return valorEsquerda + valorDireita
    }
}
