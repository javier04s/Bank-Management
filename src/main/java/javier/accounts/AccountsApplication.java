package javier.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal para iniciar la aplicación Spring Boot.
 * Esta clase configura automáticamente los componentes de la aplicación y
 * arranca el servidor embebido.
 */
@SpringBootApplication
public class AccountsApplication {

	/**
	 * Método principal que inicia la ejecución de la aplicación.
	 *
	 * @param args argumentos de línea de comandos (opcional).
	 */
	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}
}
