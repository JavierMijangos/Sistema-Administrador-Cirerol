/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import controlador.ControladorPacientes;

/**
 *
 * @author Asus
 */
public class Optometrista {
    
    public ControladorPacientes pacientes;

    public Optometrista() {
    }

    /**
     * @return the pacientes
     */
    public ControladorPacientes getPacientes() {
        return pacientes;
    }

    /**
     * @param pacientes the pacientes to set
     */
    public void setPacientes(ControladorPacientes pacientes) {
        this.pacientes = pacientes;
    }
}
