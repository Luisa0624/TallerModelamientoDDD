package Profesional.Event;

import Profesional.Values.DatosProfesional;
import co.com.sofka.domain.generic.DomainEvent;

public class ProfesionalRegistrado extends DomainEvent {

    private final DatosProfesional profesional;

    public ProfesionalRegistrado(DatosProfesional profesional) {
        super("bolsadeempleo.Profesional.ProfesionalRegistrado");
        this.profesional=profesional;
    }

    public DatosProfesional getProfesional() {
        return profesional;
    }
}
