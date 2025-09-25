/**
 * Clase que representa una persona que puede visitar el museo.
 * Cada persona tiene nombre, identificación y puede tener asignado un boleto.
 * 
 * @author Sara Segura 
 * @version 1,0
 */
public class Persona {
  private String nombre;
  private String identificacion;
  private BoletoMuseo miBoleto;
  
  /**
   * Constructor que crea una persona con nombre e identificación.
   * 
   * @param nombre el nombre de la persona
   * @param ident la identificación de la persona
   */
  public Persona(String nombre, String ident) {
    this(nombre);
    identificacion = ident;
  }
  
  /**
   * Constructor que crea una persona solo con nombre.
   * La identificación puede ser asignada posteriormente.
   * 
   * @param nombre el nombre de la persona
   */
  public Persona(String nombre) {
    this.nombre = nombre;
  }
  
  /**
   * Establece o modifica la identificación de la persona.
   * 
   * @param pIdentificacion la nueva identificación
   */
  public void setIdentificacion(String pIdentificacion) {
    identificacion = pIdentificacion;
  }
  
  /**
   * Asigna un boleto de museo a la persona.
   * 
   * @param pMiBoleto el boleto a asignar
   */
  public void asignarBoleto(BoletoMuseo pMiBoleto) {
    miBoleto = pMiBoleto;
  }
  
  /**
   * Consulta el número del boleto asignado a la persona.
   * 
   * @return el número del boleto asignado
   * @throws NullPointerException si no hay boleto asignado
   */
  public int consultarMiNumeroDeBoleto() {
    return miBoleto.getNumeroBoleto();
  }
  
  /**
   * Representación en String del objeto Persona.
   * Incluye información del nombre, identificación y boleto asignado.
   * 
   * @return una cadena con toda la información de la persona
   */
  public String toString() {
    String msg = "Persona\n";
    msg += "  Nombre: " + nombre + "\n";
    msg += "  Identificacion: " + identificacion + "\n";
    if (miBoleto != null) {
      msg += "  Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
    } else {
      msg += "  Boleto asignado: (ninguno)\n";
    }
    return msg;
  }
}