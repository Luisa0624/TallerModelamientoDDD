package Usuario.Event;

import Usuario.Values.DatosCita;
import co.com.sofka.domain.generic.DomainEvent;

public class citaagendada extends DomainEvent {

    private final DatosCita cita;

    public citaagendada(DatosCita cita) {
        super("bolsadeempleo.Usuario.citagendada");
        this.cita=cita;

    }

    public DatosCita getCita() {
        return cita;
    }
}
