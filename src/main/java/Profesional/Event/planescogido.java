package Profesional.Event;

import Profesional.Values.Plan;
import co.com.sofka.domain.generic.DomainEvent;

public class planescogido extends DomainEvent {

    private final Plan plan;

    public planescogido(Plan plan) {
        super("bolsadeempleo.Profesional.planescogido");
        this.plan=plan;
    }

    public Plan getPlan() {
        return plan;
    }
}
