package Profesional;

import Profesional.Values.Descripcion;
import Profesional.Values.Evidencias;
import Profesional.Values.PortafolioID;
import Usuario.Values.DatosCita;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Portafolio extends Entity<PortafolioID> {

    private  Descripcion descripcion;
    private  Evidencias evidencias;

    public Portafolio(PortafolioID entityId, Descripcion descripcion, Evidencias evidencias) {
        super(entityId);
        this.descripcion=descripcion;
        this.evidencias=evidencias;
    }

    //comportamientos
    public void modificarevidencias(Evidencias evidencias){
        this.evidencias = Objects.requireNonNull(evidencias);
    }

    public void modificardescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    //propiedades
        public Descripcion Descripcion() {
        return descripcion;
    }

    public Evidencias Evidencias() {
        return evidencias;
    }
}
