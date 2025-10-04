package exception;

public class UsuarioYaExiste extends RuntimeException {
    // esta excepción aparece cuando se intenta almacenar en el archivo CSV con todos los usuarios un nombre de usuario ya existente.
    public UsuarioYaExiste(String message) {
        super(message);
    }
}
