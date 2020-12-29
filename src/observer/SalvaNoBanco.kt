package observer

class SalvaNoBanco: Observer {
    override fun executa(nf: Notafiscal) {
        print("Salva no banco")
    }
}
