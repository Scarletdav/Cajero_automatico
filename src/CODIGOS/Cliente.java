package CODIGOS;

import java.util.ArrayList;
import java.util.List;
/**
 * Representa a los cliente que tendra el cajero junto a información personal y sus cuentas bancarias de cada uno.
 * Proporciona métodos para gestionar la información del cliente y las cuentas.
 * 
 * @author GRUPO HEAVY
 */
public class Cliente {
    /**
     * Nombre del cliente.
     */
    private String nombre;
    /**
     * Telefono del cliente.
     */
    private String telefono;
    /**
     * Cedula de identidad del cliente.
     */
    private String cedula;
    /**
     * Direccion del cliente.
     */
    private String direccion;
    /**
     * Contrasenia del cliente.
     */
    private String contraseña;
    /**
     * La lista de cuentas asociadas al cliente.
     */
    private List<Cuenta> cuentas;   
    /**
     * El identificador único del cliente.
     */
    private String identificador;
    
    /**
     * Crea un cliente con el identificador, nombre y contraseña.
     *
     * @param identificador El identificador del cliente.
     * @param nombre El nombre del cliente.
     * @param contraseña La contraseña del cliente.
     */
    public Cliente(String identificador, String nombre, String contraseña) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.cuentas = new ArrayList<>();
    }
 /**
     * Crea al cliente con valores por defecto.
     * La lista de cuentas se inicializa vacía.
     */
    public Cliente() {
        this.cuentas = new ArrayList<>();
    }

    /**
     * Obtiene la lista de cuentas del cliente.
     *
     * @return Una lista de Cuentas.
     */
    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    /**
     * Establece la lista de cuentas del cliente.
     *
     * @param cuentas Una lista de Cuentas.
     */
    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    /**
     * Obtiene el identificador del cliente.
     *
     * @return El identificador del cliente.
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Establece el identificador del cliente.
     *
     * @param identificador El identificador del cliente.
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el teléfono del cliente.
     *
     * @return El teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del cliente.
     *
     * @param telefono El teléfono del cliente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la cédula de identidad del cliente.
     *
     * @return La cédula de identidad del cliente.
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Establece la cédula de identidad del cliente.
     *
     * @param cedula La cédula de identidad del cliente.
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return La dirección del cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente.
     *
     * @param direccion La dirección del cliente.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la contraseña del cliente.
     *
     * @return La contraseña del cliente.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del cliente.
     *
     * @param contraseña La contraseña del cliente.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Agrega una cuenta a la lista de cuentas del cliente.
     *
     * @param cuenta La cuenta a agregar.
     */
    public void agregarCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }
}