package observer

class EnviaPorSms: Observer {
    override fun executa(notafiscal: Notafiscal) {
        print("Envia por email")
    }
}
