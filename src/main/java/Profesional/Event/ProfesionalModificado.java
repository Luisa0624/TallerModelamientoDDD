package Profesional.Event;

import Profesional.Values.DatosProfesional;
import co.com.sofka.domain.generic.DomainEvent;

public class ProfesionalModificado extends DomainEvent {

    private final DatosProfesional profesional;

    public ProfesionalModificado(DatosProfesional profesional) {
        super("bolsadeempleo.Profesional.profesionalmodificado");
        this.profesional=profesional;

    }

    public DatosProfesional getProfesional() {
        return profesional;
    }
}
