/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import Vista.VistaAdministrador;
import Vista.VistaOptometrista;
import Vista.VistaVendedor;

/**
 *
 * @author Asus
 */
public class ControladorVistas {
    
     public ControladorVistas() {
    }
    
    public void generarVista (String tipo){
        switch (tipo){
            case "Optometrista" :
                inicializarVistaOptometrista();
                break;
            case "Administrador" :
                inicializarVistaAdministrador();
                break;
            case "Vendedor" :
                inicializarVistaVendedor();
                break;
            default :
                //Se considera, pero no es necesario
        }   
    }
    
    private void inicializarVistaOptometrista(){
        VistaOptometrista vistaOptometrista = new VistaOptometrista();
        vistaOptometrista.setVisible(true);
    }
    
    private void inicializarVistaAdministrador(){
        VistaAdministrador vistaAdministrador = new VistaAdministrador();
        vistaAdministrador.setVisible(true);
    }
    
    private void inicializarVistaVendedor(){
        VistaVendedor vistaVendedor = new VistaVendedor();
        vistaVendedor.setVisible(true);
    }
}
