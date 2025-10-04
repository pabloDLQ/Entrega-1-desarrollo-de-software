package exception;

public class UsuarioExistenteException extends RuntimeException {
    // esta excepción aparece cuando se intenta almacenar en el archivo CSV con todos los usuarios un nombre de usuario ya existente.
    public UsuarioExistenteException(String message) {
        super(message);
    }
}
