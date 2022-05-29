package com.mycompany.mavenproject1;

/**
 *
 * @author Sergi
 * @version v .0 27/05/2022
 */
public class CCuenta {

/**
  * Nombre del titular de la cuenta
  */  
    private String nombre;
    
  /**
  * Numero de cuenta
  */
    private String cuenta;
    
  /**
  *Saldo en cuenta
  */
    private double saldo;
    
  /**
  *Tipo interés que se va aplicar la cuenta
  */
    private double tipoInterés;

    public CCuenta()    // mirar este
    {
    }
    /**
 * Parámetros del constructor:
 * @param nom. String que apunta una cuenta hacia una persona.
 * @param sal. Valor double del saldo en cuenta.
 * @param tipo. Representa en double el % de interés de que se aplica a la cuenta
 * @param cue. Es le numero de la cuenta asociada a una persona de tipo String.
 */
    
//metodo 
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
 
    /** @return Devuelve saldo de la cuenta
 */
    public double estado()
    {
        return saldo;
    }

//METODO QUE AÑADE VALOR A CANTIDAD
        public void ingresar(double cantidad) throws Exception
    { 
        /**
 * @throws Excepcion. Hace una llamada a Exception y lanzará la excepción 
 * correspondiente al error encontrado.
 * 
 *@param cantidad. Valor tipo double que añade o resta el saldo.
 */
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

        
//METODO QUE AÑADE SALDO Y LO RETIRA SIEMPRE Y CUANDO ESTÉ EN POSITIVO.
        
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
/** @return Devuelve el nombre al que pertenece una cuenta
 */
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
/** @return Devuelve la cuenta
 */
    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** @return Devuelve el valor saldo
 */
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
/** @return Devuelve el interés al aplicado
 */
    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    @Override
    public String toString() {
               
        return  "Titular de la cuenta: " + this.nombre + " \n" + "Cuenta: "
                + this.cuenta + " \n" + "Saldo en cuenta: " + this.saldo + 
                " \n" + "Tipo de interés: " + this.tipoInterés;
    }
    
    /** @return En este caso retorna el nombre, la cuenta, el saldo y el tipo 
     * de interés.
    */
    
}
 
