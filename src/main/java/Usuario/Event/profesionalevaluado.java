package Usuario.Event;

import Usuario.Values.Calificacion;
import co.com.sofka.domain.generic.DomainEvent;

public class profesionalevaluado extends DomainEvent {

    private Calificacion calificacion;

    public profesionalevaluado(Calificacion calificacion) {
        super("bolsadeempleo.Usuario.profesionalevaluado");
        this.calificacion=calificacion;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
