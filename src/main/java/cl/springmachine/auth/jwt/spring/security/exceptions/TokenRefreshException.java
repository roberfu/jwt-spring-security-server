package cl.springmachine.auth.jwt.spring.security.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class TokenRefreshException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TokenRefreshException(String message) {
		super(message);
	}
}