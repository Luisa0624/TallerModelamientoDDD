package Profesional.Event;

import Profesional.Values.Plan;
import co.com.sofka.domain.generic.DomainEvent;

public class plancambiado extends DomainEvent {

    private final Plan plan;

    public plancambiado(Plan plan) {
        super("bolsadeempleo.Profesional.plancambiado");
        this.plan=plan;

    }

    public Plan getPlan() {
        return plan;
    }
}
