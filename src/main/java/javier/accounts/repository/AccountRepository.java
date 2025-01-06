package javier.accounts.repository;

import javier.accounts.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio para la gestión de operaciones relacionadas con la entidad {@link Account}.
 * Extiende {@link JpaRepository}, proporcionando métodos estándar para CRUD y consultas avanzadas.
 */
public interface AccountRepository extends JpaRepository<Account, Integer> {
    // Métodos adicionales de consulta personalizados se pueden agregar aquí si es necesario.
}
