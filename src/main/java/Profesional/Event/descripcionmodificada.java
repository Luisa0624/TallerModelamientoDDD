package Profesional.Event;

import Profesional.Values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

public class descripcionmodificada extends DomainEvent {

    private final Descripcion descripcion;

    public descripcionmodificada(Descripcion descripcion) {
        super("bolsadeempleo.Profesional.descripcionmodificada");
        this.descripcion=descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
