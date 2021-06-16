package Usuario;

import Usuario.Values.Calificacion;
import Usuario.Values.EvaluacionID;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Evaluacion extends Entity<EvaluacionID> {

    private  Calificacion calificacion;

    public Evaluacion(EvaluacionID entityId, Calificacion calificacion) {
        super(entityId);
        this.calificacion=calificacion;
    }

    //comportamientos
    public void CalificarServicio(Calificacion calificacion){
        this.calificacion = Objects.requireNonNull(calificacion);
    }

    //propiedades
    public Calificacion Calificacion() {
        return calificacion;
    }

}
