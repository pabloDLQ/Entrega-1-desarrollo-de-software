package service;

import exception.UsuarioExistenteException;
import model.Usuario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorUsuario {
    private static final String usuariosCargados = "src\\main\\resources\\usuariosCargados.csv"; // archivo con los usuarios cargados (bdd)

    /**
     * Lee el contenido del archivo "usuariosCargados.csv" y
     * recopila la informacion almacenada en el mismo para armar
     * una lista de todos los usuarios guardados en el sistema
     *
     * @return lista de elementos de tipo <code>Usuario</code>
     */
    public static ArrayList<Usuario> retornarUsuarios() throws IOException{
        // busco los usuarios cargados en el archivo CSV, los almaceno en una lista y los retorno
        ArrayList<Usuario> listaUsuario = new ArrayList<>();

        BufferedReader lector = new BufferedReader(new FileReader(usuariosCargados));
        String linea;
        // busco en el CSV y almaceno cada usuario en la lista de retorno
        while((linea = lector.readLine()) != null){
            String[] partes = linea.split(",");
            if(partes.length == 2) {
                String nombre = partes[0].trim(); // trim sirve para sacar los espacios en blanco del string
                String contrasena = partes[1].trim();
                listaUsuario.add(new Usuario(nombre,contrasena));
            }
        }

        return listaUsuario;
    }

    /**
     * Esta funcion se fija si el usuario pasado por parametro ya existe en el sistema
     * @param usuario es el usuario del cual se quiere verificar la existencia
     * @return devuelve <code>true</code> si el usuario ya existe y <code>false</code> si no existe
     * @throws UsuarioExistenteException cuando el usuario ya existe en el sistema
     * @throws IOException si no se pudo abrir correctamente el archivo "usuariosCargados.csv"
     */
    public boolean usuarioExistente(Usuario usuario) throws UsuarioExistenteException,IOException {
        // verifico que el usuario no esté ya en el sistema

        ArrayList<Usuario> listaUsuarios = retornarUsuarios();
        boolean usuarioExiste = listaUsuarios.stream()
                .anyMatch(u -> u.getNombre().equals(usuario.getNombre()));

        if (usuarioExiste) {
            throw new UsuarioExistenteException("El usuario ingresado ya existe en el sistema");
        }
        return false;
    }

    /**
     * Esta funcion verifica si el usuario pasado por parametro existe en el sistema y
     * lo registra en caso de no existir. En caso contrario, devuelve una excepcion
     * del tipo <code>UsuarioYaExiste</code>
     *
     * @param usuario nuevo usuario que se desea registrar al sistema
     * @throws UsuarioExistenteException esta excepcion sucede cuando <code>usuario</code> ya existe en la base de datos
     */
    public void agregarUsuario(Usuario usuario) throws UsuarioExistenteException,IOException{
        // busco el archivo con información en resources y si no está cargado un usuario con ese nombre, lo carga.

        // verifico que el usuario no esté ya en el sistema
        if(!usuarioExistente(usuario)) {
            // agrego el usuario al archivo csv
            FileWriter escritor = new FileWriter(usuariosCargados,true);

            escritor.write(usuario.getNombre()+","+usuario.getContrasena()+"\n");
            escritor.close();
        }
    }
    public void modificarUsuario(Usuario usuario){

    }
    public void eliminarUsuario(Usuario usuario){

    }
    public boolean autenticarUsuario(String nombre, String contrasena) throws IOException{
        // autentico si el usuario está cargado en la bdd o no, retornando el resultado
        ArrayList<Usuario> listaUsuarios = retornarUsuarios();
        boolean resultado;
        resultado = false;

        // analizo usuario a usuario si está
        for(Usuario u : listaUsuarios){
            if(u.getNombre().equals(nombre) && u.getContrasena().equals(contrasena)){
                resultado = true;
                break;
            }
        }

        return resultado;
    }
}
