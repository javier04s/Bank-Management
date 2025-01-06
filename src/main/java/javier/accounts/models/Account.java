package javier.accounts.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Representa una cuenta bancaria en el sistema.
 * Esta clase es una entidad gestionada por JPA y define las propiedades básicas de una cuenta.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {

    /**
     * Identificador único de la cuenta.
     * Generado automáticamente utilizando la estrategia {@link GenerationType#IDENTITY}.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer accountId;

    /**
     * Nombre del titular de la cuenta.
     */
    String name;

    /**
     * Tipo de cuenta (por ejemplo, "Ahorro", "Credito").
     */
    String accountType;

    /**
     * Saldo actual de la cuenta.
     */
    Double balance;
}
