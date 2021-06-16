package Profesional;

import Profesional.Values.AgendaID;
import Profesional.Values.DatosAgenda;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Agenda extends Entity<AgendaID> {

    private DatosAgenda agenda;

    public Agenda(AgendaID entityId, DatosAgenda agenda) {
        super(entityId);
        this.agenda=agenda;
    }

    //comportamientos
    public void modificaragenda(DatosAgenda agenda){
        this.agenda = Objects.requireNonNull(agenda);
    }
    //propiedades
    public DatosAgenda Agenda() {
        return agenda;
    }


}
