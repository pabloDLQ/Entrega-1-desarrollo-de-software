import exception.UsuarioExistenteException;
import model.Usuario;
import service.GestorUsuario;

import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){

        try {
            GestorUsuario gestorUsuario = new GestorUsuario();

            ArrayList<Usuario> lista = GestorUsuario.retornarUsuarios();

            Usuario user = new Usuario("juan","locopiojo45");
            gestorUsuario.agregarUsuario(user);
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (UsuarioExistenteException ue) {
            System.out.println(ue.getMessage());
        }

    }

    public static void verificarUsuario(){
    }
}
