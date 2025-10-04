package service;

import exception.UsuarioYaExiste;
import model.Usuario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorUsuario {
    private static final String usuariosCargados = "src\\main\\resources\\usuariosCargados.csv"; // archivo con los usuarios cargados (bdd)

    public static ArrayList<Usuario> retornarUsuarios(){
        // busco los usuarios cargados en el archivo CSV, los almaceno en una lista y los retorno
        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        try{
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
        }catch (IOException e){
            System.out.println("❌ Error: " + e.getMessage());
        }
        return listaUsuario;
    }
    public void agregarUsuario(Usuario usuario){
        // busco el archivo con información en resources y si no está cargado un usuario con ese nombre, lo carga.
        try {
            // verifico que el usuario no esté ya en el sistema
            ArrayList<Usuario> listaUsuarios = retornarUsuarios();
            listaUsuarios.forEach(u -> {
                if(u.getNombre().equals(usuario.getNombre())) {
                    throw new UsuarioYaExiste("El usuario ingresado ya existe en el sistema");
                }
            });

            // agrego el usuario al archivo csv
            FileWriter escritor = new FileWriter(usuariosCargados,true);

            escritor.write(usuario.getNombre()+","+usuario.getContrasena()+"\n");
            escritor.close();
        }
        catch (UsuarioYaExiste ue){
            System.out.println("❌ Error: " + ue.getMessage());
        }
        catch(IOException e){
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
    public void modificarUsuario(Usuario usuario){

    }
    public void eliminarUsuario(Usuario usuario){

    }
    public boolean autenticarUsuario(String nombre, String contrasena){
        // autentico si el usuario está cargado en la bdd o no, retornando el resultado
        ArrayList<Usuario> listaUsuarios = retornarUsuarios();
        boolean resultado;
        resultado = false;

        // analizo usuario a usuario si está
        for(Usuario u : listaUsuarios){
            if(u.getNombre().equals(nombre) && u.getContrasena().equals(contrasena)){
                resultado = true;
            }
        }

        return resultado;
    }
}
