package fatec.labbd.provalabbd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TrabalhoNaoEncontradoException extends IllegalArgumentException {
    
    public TrabalhoNaoEncontradoException() {
        super();
    }

    public TrabalhoNaoEncontradoException(String message) {
        super(message);
    }

    public TrabalhoNaoEncontradoException(String message, Throwable t) {
        super(message, t);
    }

}