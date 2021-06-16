package Profesional.Command;

import Profesional.Values.DatosProfesional;

public class modificarprofesional {

    public DatosProfesional getProfesional() {
        return profesional;
    }

    private final DatosProfesional profesional;

    public modificarprofesional(DatosProfesional profesional) {
        this.profesional = profesional;
    }
}
