package javier.accounts.services;

import javier.accounts.models.Account;
import javier.accounts.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementación del servicio para la gestión de cuentas.
 * Proporciona métodos para listar, buscar, guardar y eliminar cuentas.
 */
@Service
public class AccountService implements iAccountService {

    @Autowired
    private AccountRepository accountRepository; // Repositorio para interactuar con la base de datos.

    /**
     * Obtiene una lista de todas las cuentas almacenadas.
     *
     * @return una lista de objetos {@link Account}.
     */
    @Override
    public List<Account> listAccounts() {
        return accountRepository.findAll();
    }

    /**
     * Busca una cuenta por su ID.
     *
     * @param accountId el identificador único de la cuenta.
     * @return un objeto {@link Account} si se encuentra, o {@code null} si no existe.
     */
    @Override
    public Account searchAccountById(int accountId) {
        return accountRepository.findById(accountId).orElse(null);
    }

    /**
     * Guarda o actualiza una cuenta en la base de datos.
     *
     * @param account el objeto {@link Account} a guardar.
     */
    @Override
    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

    /**
     * Elimina una cuenta de la base de datos.
     *
     * @param account el objeto {@link Account} a eliminar.
     */
    @Override
    public void deleteAccount(Account account) {
        accountRepository.delete(account);
    }
}
