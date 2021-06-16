package Profesional;

import Profesional.Values.MembresiaID;
import Profesional.Values.Plan;
import Usuario.Values.DatosCita;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Membresia extends Entity<MembresiaID> {

    private Plan plan;

    public Membresia(MembresiaID entityId, Plan plan) {
        super(entityId);
        this.plan=plan;
    }

    //comportamientos
    public void escogerplan(Plan plan){
        this.plan = Objects.requireNonNull(plan);
    }

    public void cambiarplan(Plan plan){
        this.plan = Objects.requireNonNull(plan);
    }

    //propiedades
    public Plan Plan() {
        return plan;
    }

}
