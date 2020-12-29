package memento

class Historico() {

    val estadorsalvos = ArrayList<Estado>()

    fun pega(index: Int): Estado {
        return estadorsalvos?.get(index)
    }

    fun adiciona(estado: Estado) {
        estadorsalvos.add(estado)
    }
}