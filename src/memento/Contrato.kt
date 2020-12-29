package memento

import java.util.*

class Contrato(val data: Calendar,
               val cliente: String,
               var tipo: TipoContrato
) {

    fun avanca() {
        if (tipo == TipoContrato.NOVO)
            tipo = TipoContrato.EM_ANDAMENTO

        if (tipo == TipoContrato.EM_ANDAMENTO)
            tipo = TipoContrato.ACERTADO

        if (tipo == TipoContrato.ACERTADO)
            tipo = TipoContrato.CONCLUIDO
    }

    fun salvaEstado(): Estado{
        return Estado(Contrato(data, cliente, tipo))
    }
}