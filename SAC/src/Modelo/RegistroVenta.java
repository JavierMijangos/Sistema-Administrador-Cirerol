/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class RegistroVenta {
    
    private List productos = new ArrayList();//Cambiar si es necesario.
    private String nombreVendedor;
    private String nombrePaciente;
    private float montoTotal;
    private float anticipo;
    private float pagoAbonos;
    private boolean pagado;
    private float comision;

    public RegistroVenta() {
    }
    
    
    
}
