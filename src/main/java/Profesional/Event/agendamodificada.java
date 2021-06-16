package Profesional.Event;

import Profesional.Values.DatosAgenda;
import Usuario.Values.DatosUsuario;
import co.com.sofka.domain.generic.DomainEvent;

public class agendamodificada extends DomainEvent {

    private final DatosAgenda agenda;

    public agendamodificada(DatosAgenda agenda) {
        super("bolsadeempleo.Profesional.agendamodificada");
        this.agenda=agenda;
    }

    public DatosAgenda getAgenda() {
        return agenda;
    }
}
