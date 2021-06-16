package Usuario;

import Usuario.Values.Calificacion;
import Usuario.Values.CitaID;
import Usuario.Values.DatosCita;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cita extends Entity<CitaID> {

    private DatosCita cita;

    public Cita(CitaID entityId, DatosCita cita) {
        super(entityId);
        this.cita=cita;
    }

    //comportamientos
    public void AgendarCita(DatosCita cita){
        this.cita = Objects.requireNonNull(cita);
    }

    public void ActualizarCita(DatosCita cita){
        this.cita = Objects.requireNonNull(cita);
    }

    //propiedades
    public DatosCita Cita() {
        return cita;
    }


}
