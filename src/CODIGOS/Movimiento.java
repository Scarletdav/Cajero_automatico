package CODIGOS;

import java.util.Date;

/**
 * Representa los movimiento en una cuenta.
 * Contiene información sobre el tipo de movimiento, el monto y la fecha de la transacción.
 * 
 * @author GRUPO HEAVY
 */
public class Movimiento {
    /**
     * El tipo de movimiento (depósito, retiro).
     */
    private String tipo;
    
    /**
     * El monto del movimiento.
     */
    private double monto;
    
    /**
     * La fecha en que se realizó el movimiento.
     */
    private Date fecha;

    /**
     * Crea un movimiento con valores por defecto.
     */
    public Movimiento() {
    }

    /**
     * Crea un movimiento con los parámetros especificados.
     *
     * @param tipo El tipo de movimiento.
     * @param monto El monto del movimiento.
     * @param fecha La fecha en que se realizó el movimiento.
     */
    public Movimiento(String tipo, double monto, Date fecha) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
    }

    /**
     * Obtiene el tipo de movimiento.
     *
     * @return El tipo de movimiento.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de movimiento.
     *
     * @param tipo El tipo de movimiento.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el monto del movimiento.
     *
     * @return El monto del movimiento.
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Establece el monto del movimiento.
     *
     * @param monto El monto del movimiento.
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /**
     * Obtiene la fecha del movimiento.
     *
     * @return La fecha del movimiento.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del movimiento.
     *
     * @param fecha La fecha del movimiento.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
