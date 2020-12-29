package padroes_pj_2.flyweight

import padroes_pj_2.flyweight.model.*

class NotasMusicais {

    private val notas = HashMap<String, Nota>()

    init {
        notas["do"] = Do()
        notas["re"] = Re()
        notas["mi"] = Mi()
        notas["fa"] = Fa()
        notas["sol"] = Sol()
        notas["la"] = La()
        notas["si"] = Si()
    }

    fun get(nota: String): Nota? {
        return notas?.get(nota)
    }
}