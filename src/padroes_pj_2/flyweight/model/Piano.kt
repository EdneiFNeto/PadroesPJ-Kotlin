package padroes_pj_2.flyweight.model

class Piano {

    fun tocar(musicais: List<Nota>){
        var stringBuilder = StringBuilder()
        for( musica in musicais){
            stringBuilder.append("$musica ")
        }
        println("Toncando musica $stringBuilder")
    }

}
