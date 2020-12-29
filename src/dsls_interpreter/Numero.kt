package dsls_interpreter

class Numero(var num: Int): Expressao {
    override fun avalia()= num

}
