package CODIGOS;

import java.util.ArrayList;
/**
 * Representa una cuenta que pertenece a un cliente. Cuenta con información sobre el tipo de cuenta,
 * tipo de moneda, número de cuenta, saldos inicial y actual, y una lista de movimientos asociados a la cuenta.
 * 
 * @author GRUPO HEAVY
 */
public class Cuenta {
    
    /**
     * El tipo de cuenta (ahorros, corriente,etc).
     */
    private String tipoCuenta;
    
    /**
     * El tipo de moneda (BS,USD, EUR).
     */
    private String tipoMOneda;
    
    /**
     * El número de cuenta.
     */
    private String numeroCuenta;
    
    /**
     * El saldo inicial de la cuenta.
     */
    private double saldoInicial;
    
    /**
     * El saldo actual de la cuenta.
     */
    private double saldoActual;
    
    /**
     * El cliente al que pertenece esta cuenta.
     */
    private Cliente cliente; 
    
    /**
     * La cédula de identidad del cliente.
     */
    private String cedula;
   
 
    /**
     * La lista de movimientos de la cuenta.
     */
    private ArrayList<Movimiento> mismovimientos;
    
    /**
     * Contador para generar números de cuenta únicos.
     */
    private static int contadorCuentas = 0;
    
    /**
     * Crea una cuenta con una lista de movimientos vacía y genera un número de cuenta.
     */
    public Cuenta() {
        mismovimientos = new ArrayList<Movimiento>();
        this.numeroCuenta = generarNumeroCuentaUnico();
    }
    
    /**
     * Genera un número de cuenta único incrementando el contador de cuentas.
     *
     * @return El número de cuenta generado.
     */
    private String generarNumeroCuentaUnico() {
        contadorCuentas++;
        return String.format("%010d", contadorCuentas);
    }
    
    /**
     * Agrega un movimiento a la lista de movimientos de la cuenta.
     *
     * @param mov El movimiento a agregar.
     */
    public void agregarMovimiento(Movimiento mov){
        mismovimientos.add(mov);
    }
    
    /**
     * Obtiene la lista de movimientos de la cuenta.
     *
     * @return La lista de movimientos.
     */
    public ArrayList<Movimiento> getMismovimientos() {
        return mismovimientos;
    }
    
    /**
     * Establece la lista de movimientos de la cuenta.
     *
     * @param mismovimientos Una lista de movimientos.
     */
    public void setMismovimientos(ArrayList<Movimiento> mismovimientos) {
        this.mismovimientos = mismovimientos;
    }
    
    /**
     * Obtiene el tipo de cuenta.
     *
     * @return El tipo de cuenta.
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    
    /**
     * Establece el tipo de cuenta.
     *
     * @param tipoCuenta El tipo de cuenta.
     */
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    /**
     * Obtiene el tipo de moneda.
     *
     * @return El tipo de moneda.
     */
    public String getTipoMOneda() {
        return tipoMOneda;
    }
    
    /**
     * Establece el tipo de moneda.
     *
     * @param tipoMOneda El tipo de moneda.
     */
    public void setTipoMOneda(String tipoMOneda) {
        this.tipoMOneda = tipoMOneda;
    }
    
    /**
     * Obtiene el número de cuenta.
     *
     * @return El número de cuenta.
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    /**
     * Establece el número de cuenta.
     *
     * @param numeroCuenta El número de cuenta.
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    /**
     * Obtiene el saldo inicial de la cuenta.
     *
     * @return El saldo inicial.
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }
    
    /**
     * Establece el saldo inicial de la cuenta.
     *
     * @param saldoInicial El saldo inicial.
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    
    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo actual.
     */
    public double getSaldoActual() {
        return saldoActual;
    }
    
    /**
     * Establece el saldo actual de la cuenta.
     *
     * @param saldoActual El saldo actual.
     */
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
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
     * Obtiene el cliente asociado a esta cuenta.
     *
     * @return El cliente asociado.
     */
    public Cliente getCliente() {
        return cliente;
    }
    
    /**
     * Establece el cliente asociado a esta cuenta.
     *
     * @param cliente El cliente a asociar.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}