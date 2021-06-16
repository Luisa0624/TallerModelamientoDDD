package Servicio.Event;

import Servicio.Values.NombreCategoria;
import co.com.sofka.domain.generic.DomainEvent;

public class ServicioCreado extends DomainEvent {

    private final NombreCategoria categoria;

    public ServicioCreado(NombreCategoria categoria) {
        super("bolsadeempleo.Servicio.ServicioCreado");
        this.categoria=categoria;
    }

    public NombreCategoria getCategoria() {
        return categoria;
    }

}
