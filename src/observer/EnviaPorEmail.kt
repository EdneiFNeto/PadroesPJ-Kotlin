package observer

class EnviaPorEmail: Observer {
    override fun executa(nf: Notafiscal) {
        println("Envia por SMS")
    }
}
