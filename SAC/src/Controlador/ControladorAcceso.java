/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import dao.DaoFactory;
import modelo.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ControladorAcceso {

    Usuario usuario = new Usuario();
    
    public ControladorAcceso() {
    }
    
    private boolean usuarioValido (String campoUsuario, String campoContrasena){
        boolean esUsuarioValido = false;
        DaoFactory daoFactory = new DaoFactory();
        
        usuario.setNombreUsuario(campoUsuario);
        usuario.setClave(campoContrasena);
        
        try {
            esUsuarioValido = daoFactory.obtenerDaoUsuarios().
                    existe(usuario);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAcceso.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        
        if (esUsuarioValido){
           return true;
        }
        else{
            return false;
        }
    }
    
    public void acceder (String campoUsuario, String campoClave){
        ControladorEmpleado controladorEmpleado; 
        ControladorVistas controladorVistas; 
        String tipoUsuario = null;
        
        if (usuarioValido(campoUsuario, campoClave)){
          controladorEmpleado = new ControladorEmpleado();
          controladorVistas = new ControladorVistas();
          tipoUsuario= controladorEmpleado.obtenerTipoEmpleado(usuario); 
          controladorVistas.generarVista(tipoUsuario);
        }     
    }
}
