import model.Usuario;
import service.GestorUsuario;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){

        GestorUsuario gestorUsuario = new GestorUsuario();

        ArrayList<Usuario> lista = GestorUsuario.retornarUsuarios();

        Usuario user = new Usuario("ernesto","locopiojo45");
        gestorUsuario.agregarUsuario(user);
    }

    public static void verificarUsuario(){
    }
}
