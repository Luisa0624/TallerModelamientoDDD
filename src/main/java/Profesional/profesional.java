package Profesional;

import Profesional.Event.*;
import Profesional.Values.*;
import Usuario.UsuarioChange;
import Usuario.Values.DatosUsuario;
import Usuario.Values.UsuarioID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Set;

public class profesional extends AggregateEvent<ProfesionalID> {

    protected DatosProfesional profesional;
    protected Set<Membresia> membresia;
    protected Set<Portafolio> portafolio;
    protected Set<Agenda> agenda;

    public profesional(ProfesionalID entityId, DatosProfesional profesional) {
        super(entityId);
        appendChange(new ProfesionalRegistrado(profesional)).apply();
    }

    private profesional(ProfesionalID entityId){
        super(entityId);
        subscribe(new ProfesionalChange(this));
    }

    public void modificarprofesional(DatosProfesional profesional){
        appendChange(new ProfesionalModificado(profesional)).apply();
    }
    public void modificarevidencias(Evidencias evidencias){
        appendChange(new evidenciasmodificadas(evidencias)).apply();
    }

    public void modificardescripcion(Descripcion descripcion){
        appendChange(new descripcionmodificada(descripcion)).apply();
    }

    public void modificaragenda(DatosAgenda agenda){
        appendChange(new agendamodificada(agenda)).apply();
    }

    public void escogerplan(Plan plan){
        appendChange(new planescogido(plan)).apply();
    }

    public void cambiarplan(Plan plan){
        appendChange(new plancambiado(plan)).apply();

    }
}
