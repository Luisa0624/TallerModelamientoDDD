package Profesional.Event;

import Profesional.Values.Evidencias;
import co.com.sofka.domain.generic.DomainEvent;

public class evidenciasmodificadas extends DomainEvent {

   private final Evidencias evidencias;

    public evidenciasmodificadas(Evidencias evidencias) {
        super("bolsadeempleo.Profesional.evidenciasmodificadas");
        this.evidencias=evidencias;

    }

    public Evidencias getEvidencias() {
        return evidencias;
    }
}
