package Usuario;

import Profesional.Values.DatosAgenda;
import Servicio.Values.NombreCategoria;
import Usuario.Event.UsuarioModificado;
import Usuario.Event.UsuarioRegistrado;
import Usuario.Event.citaagendada;
import Usuario.Event.profesionalevaluado;
import Usuario.Values.Calificacion;
import Usuario.Values.DatosCita;
import Usuario.Values.DatosUsuario;
import Usuario.Values.UsuarioID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Usuario extends AggregateEvent<UsuarioID> {

    protected DatosUsuario datos;
    protected DatosCita cita;
    protected Set<Evaluacion> evaluacion;

    public Usuario(UsuarioID entityId, DatosUsuario datos) {
        super(entityId);
        appendChange(new UsuarioRegistrado(datos)).apply();
    }

    private Usuario(UsuarioID entityId){
        super(entityId);
        subscribe(new UsuarioChange(this));
    }

    public void modificarUsuario(DatosUsuario datos){
        appendChange(new UsuarioModificado(datos)).apply();
    }

    public void agendarcita(DatosCita cita){
        appendChange(new citaagendada(cita)).apply();
    }

    public void evaluarprofesional(Calificacion calificacion){
        appendChange(new profesionalevaluado(calificacion)).apply();
    }
}
