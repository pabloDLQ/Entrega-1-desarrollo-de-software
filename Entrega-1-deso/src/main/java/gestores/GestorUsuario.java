package gestores;

import clases.Usuario;

public class GestorUsuario {
    //todo: no estoy seguro si esto tendría que ser una interfáz o si la interfaz va en el dao, pero hay que poner alguna interfaz por ahi
    public boolean agregarUsuario(){
        return true;
    }
    public boolean modificarUsuario(Usuario usuario){
        return true;
    }
    public boolean eliminarUsuario(Usuario usuario){
        return true;
    }
    public boolean autenticarUsuario(String nombre, String contrasena){
        return true;
    }
}
