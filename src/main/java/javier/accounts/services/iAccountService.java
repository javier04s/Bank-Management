package javier.accounts.services;

import javier.accounts.models.Account;

import java.util.List;

/**
 * Interfaz que define las operaciones principales para la gestión de cuentas.
 * Proporciona métodos para listar, buscar, guardar y eliminar cuentas.
 */
public interface iAccountService {

    /**
     * Obtiene una lista de todas las cuentas almacenadas.
     *
     * @return una lista de objetos {@link Account}.
     */
    public List<Account> listAccounts();

    /**
     * Busca una cuenta específica por su ID.
     *
     * @param accountId el identificador único de la cuenta.
     * @return un objeto {@link Account} si se encuentra, o {@code null} si no existe.
     */
    public Account searchAccountById(int accountId);

    /**
     * Guarda o actualiza una cuenta en el sistema.
     *
     * @param account el objeto {@link Account} a guardar.
     */
    public void saveAccount(Account account);

    /**
     * Elimina una cuenta específica del sistema.
     *
     * @param account el objeto {@link Account} a eliminar.
     */
    public void deleteAccount(Account account);
}
