package Profesional.Command;

import Profesional.Values.DatosAgenda;

public class modificaragenda {

    public DatosAgenda getAgenda() {
        return agenda;
    }

    private final DatosAgenda agenda;

    public modificaragenda(DatosAgenda agenda) {
        this.agenda = agenda;
    }
}
