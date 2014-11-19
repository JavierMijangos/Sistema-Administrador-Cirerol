/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import dao.DaoEmpleado;
import dao.DaoFactory;
import dao.DaoUsuario;
import dao.DaoUsuarioEmpleado;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Usuario;

/**
 *
 * @author Asus
 */
public class ControladorEmpleado {
    private Empleado empleado;
    private DaoEmpleado daoEmpleado = new DaoEmpleado();
    private DaoUsuario daoUsuario= new DaoUsuario();
    private DaoUsuarioEmpleado daoUsuarioEmpleado = new DaoUsuarioEmpleado();
    
    public void registrarEmpleado(Empleado empleado, Usuario usuario, String ClaveAConfirmar){
          if (FormularioValido(empleado, usuario)){
            try {
                daoEmpleado.guardar(empleado);
                daoUsuario.guardar(usuario);
                daoUsuarioEmpleado.setUsuario(empleado, usuario);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
                       
        }
        else{
            JOptionPane.showMessageDialog(null, "Lo sentimos pero alguno de "
                    + "sus campos no es valido");
        }
    }
    
    public void modificarEmpleado(){
        
    }
    
    public void eliminarEmpleado(){
        
    }
    
    public void buscarEmpleado(){
        
    }
    
     public String obtenerTipoEmpleado (Usuario usuario) {
        Empleado empleado = new Empleado();
        DaoFactory daoFactory = new DaoFactory();
        String tipo= "";
        
        try {
            empleado= daoFactory.obtenerDaoUsuarioEmpleado().
                    getInformacionEmpleadoLogueado(usuario);
            tipo = empleado.getRol();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tipo;       
    }
    
    private boolean clavesIguales(String clave, String claveAConfirmar){
        if (clave.matches(claveAConfirmar)){
            return true;
        }else{
            return false;
        }
    } 
    
    private boolean FormularioValido(Empleado empleado, Usuario usuario){
        
        return true;
        
    }
}
