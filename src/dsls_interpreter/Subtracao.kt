package dsls_interpreter

class Subtracao(var esquerda : Expressao, var direita: Expressao): Expressao {
    override fun avalia(): Int {
        var valorDireita = direita.avalia()
        var valorEsquerda = esquerda.avalia()
        return valorEsquerda - valorDireita
    }

}
