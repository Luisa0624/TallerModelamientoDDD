package Servicio;

import Servicio.Event.ServicioModificado;
import Usuario.Event.UsuarioRegistrado;
import co.com.sofka.domain.generic.EventChange;

public class ServicioChange extends EventChange {

    public ServicioChange(Servicio servicio) {

        apply((ServicioModificado event) ->{
            servicio.categoria=event.getCategoria();
        });

    }
}
