/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import controlador.ControladorDeudas;
import controlador.ControladorVentas;

/**
 *
 * @author Asus
 */
public class Vendedor {
    
    public ControladorDeudas deudas;
    public ControladorVentas ventas;

    public Vendedor() {
    }

    /**
     * @return the deudas
     */
    public ControladorDeudas getDeudas() {
        return deudas;
    }

    /**
     * @param deudas the deudas to set
     */
    public void setDeudas(ControladorDeudas deudas) {
        this.deudas = deudas;
    }

    /**
     * @return the ventas
     */
    public ControladorVentas getVentas() {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(ControladorVentas ventas) {
        this.ventas = ventas;
    }
}
