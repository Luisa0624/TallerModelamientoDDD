package Usuario.Command;

import Usuario.Values.Calificacion;
import co.com.sofka.domain.generic.Command;

public class evaluarprofesional implements Command {

    public Calificacion getCalificacion() {
        return calificacion;
    }

    private final Calificacion calificacion;

    public evaluarprofesional(Calificacion calificacion) {
        this.calificacion = calificacion;
    }
}
