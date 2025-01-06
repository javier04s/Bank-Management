package javier.accounts.controllers;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import javier.accounts.models.Account;
import javier.accounts.services.AccountService;
import lombok.Data;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Controlador de la vista principal para gestionar cuentas.
 * Este controlador permite listar, agregar, editar y eliminar cuentas,
 * interactuando con el servicio {@link AccountService}.
 * Es un componente de JSF con ámbito de vista.
 */
@Component
@Data
@ViewScoped
public class IndexController {

    @Autowired
    private AccountService accountService; // Servicio para la gestión de cuentas.
    private List<Account> accounts; // Lista de cuentas disponibles.
    private Account selectedAccount; // Cuenta seleccionada para operaciones.

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class); // Logger para registrar eventos.

    /**
     * Método inicial que se ejecuta después de construir el controlador.
     * Carga la lista de cuentas.
     */
    @PostConstruct
    public void init() {
        loadData();
    }

    /**
     * Carga la lista de cuentas desde el servicio.
     * Registra cada cuenta en los logs.
     */
    public void loadData() {
        this.accounts = accountService.listAccounts();
        accounts.forEach(account -> logger.info(account.toString()));
    }

    /**
     * Prepara un objeto de cuenta vacío para ser agregado.
     * Este método se utiliza antes de mostrar el formulario de creación.
     */
    public void addAccount() {
        this.selectedAccount = new Account();
    }

    /**
     * Guarda una cuenta en el sistema.
     * Si la cuenta no tiene un ID, se crea como una nueva; de lo contrario, se actualiza.
     * Muestra mensajes de confirmación en la interfaz y actualiza la tabla.
     */
    public void saveAccount() {
        logger.info("Cuenta a guardar: " + this.selectedAccount);
        if (this.selectedAccount.getAccountId() == null) {
            accountService.saveAccount(this.selectedAccount);
            accounts.add(this.selectedAccount);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cuenta Agregada"));
        } else {
            this.accountService.saveAccount(this.selectedAccount);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cuenta Actualizada"));
        }

        // Ocultar la ventana modal.
        PrimeFaces.current().executeScript("PF('windowModalAccount').hide()");

        // Actualizar la tabla.
        PrimeFaces.current().ajax().update("account-form:messages", "account-form:account-table");

        // Restablecer la cuenta seleccionada.
        this.selectedAccount = null;
    }

    /**
     * Elimina la cuenta seleccionada del sistema.
     * También la elimina de la lista de cuentas mostrada y actualiza la interfaz.
     */
    public void deleteAccount() {
        logger.info("Cuenta a eliminar: " + this.selectedAccount);
        this.accountService.deleteAccount(this.selectedAccount);

        // Eliminar el registro de la lista de cuentas.
        this.accounts.remove(this.selectedAccount);

        // Restablecer la cuenta seleccionada.
        this.selectedAccount = null;

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cuenta Eliminada"));
        PrimeFaces.current().ajax().update("account-form:messages", "account-form:account-table");
    }
}
