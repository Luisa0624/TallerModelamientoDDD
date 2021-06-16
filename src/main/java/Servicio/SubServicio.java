package Servicio;

import Profesional.Values.ProfesionalID;
import Servicio.Values.NombreSubServicio;
import Servicio.Values.Precio;
import Servicio.Values.SubservicioID;
import Usuario.Values.DatosCita;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;
import java.util.Set;

public class SubServicio extends Entity<SubservicioID> {

    private  NombreSubServicio subServicio;
    private  Precio precio;
    private Set<ProfesionalID> profesional;

    public SubServicio(SubservicioID entityId, NombreSubServicio subServicio, Precio precio) {
        super(entityId);
        this.subServicio=subServicio;
        this.precio=precio;
    }

    //comportamientos
    public void ActualizarSubservicio(NombreSubServicio subServicio){
        this.subServicio = Objects.requireNonNull(subServicio);
    }

    public void AsignarPrecio(Precio precio){
        this.precio = Objects.requireNonNull(precio);
    }

    public void FiltrarProfesionales(ProfesionalID profesional){
        this.profesional= (Set<ProfesionalID>) profesional;
    }

    //propiedades
    public NombreSubServicio SubServicio() {
        return subServicio;
    }

    public Precio Precio() {
        return precio;
    }

    public Set<ProfesionalID> Profesional() {
        return profesional;
    }


}
