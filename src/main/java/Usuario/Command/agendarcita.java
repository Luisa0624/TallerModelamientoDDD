package Usuario.Command;

import Usuario.Values.DatosCita;

public class agendarcita {

    public DatosCita getCita() {
        return cita;
    }

    private final DatosCita cita;

    public agendarcita(DatosCita cita) {
        this.cita = cita;
    }
}
