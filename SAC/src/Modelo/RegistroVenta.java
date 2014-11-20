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
    
    public List productos = new ArrayList();//Cambiar si es necesario.
    public String nombreVendedor;
    public String nombrePaciente;
    public float montoTotal;
    public float anticipo;
    public float pagoAbonos;
    public boolean pagado;
    public float comision;

    public RegistroVenta() {
    }

    /**
     * @return the productos
     */
    public List getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List productos) {
        this.productos = productos;
    }

    /**
     * @return the nombreVendedor
     */
    public String getNombreVendedor() {
        return nombreVendedor;
    }

    /**
     * @param nombreVendedor the nombreVendedor to set
     */
    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    /**
     * @return the nombrePaciente
     */
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    /**
     * @param nombrePaciente the nombrePaciente to set
     */
    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    /**
     * @return the montoTotal
     */
    public float getMontoTotal() {
        return montoTotal;
    }

    /**
     * @param montoTotal the montoTotal to set
     */
    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * @return the anticipo
     */
    public float getAnticipo() {
        return anticipo;
    }

    /**
     * @param anticipo the anticipo to set
     */
    public void setAnticipo(float anticipo) {
        this.anticipo = anticipo;
    }

    /**
     * @return the pagoAbonos
     */
    public float getPagoAbonos() {
        return pagoAbonos;
    }

    /**
     * @param pagoAbonos the pagoAbonos to set
     */
    public void setPagoAbonos(float pagoAbonos) {
        this.pagoAbonos = pagoAbonos;
    }

    /**
     * @return the pagado
     */
    public boolean isPagado() {
        return pagado;
    }

    /**
     * @param pagado the pagado to set
     */
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    /**
     * @return the comision
     */
    public float getComision() {
        return comision;
    }

    /**
     * @param comision the comision to set
     */
    public void setComision(float comision) {
        this.comision = comision;
    }
    
}
