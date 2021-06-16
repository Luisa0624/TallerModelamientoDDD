package Servicio.Event;

import Servicio.Values.NombreCategoria;
import co.com.sofka.domain.generic.DomainEvent;

public class ServicioModificado extends DomainEvent {

    private final NombreCategoria categoria;

    public ServicioModificado(NombreCategoria categoria) {
        super("bolsadeempleo.Servicio.serviciomodificado");
        this.categoria=categoria;
    }

    public NombreCategoria getCategoria() {
        return categoria;
    }
}
