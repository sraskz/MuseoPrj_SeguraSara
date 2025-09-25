/**
 * Clase que representa un boleto para el museo.
 * Contiene información sobre el precio, número único, fecha de emisión
 * y lleva un control estático de la cantidad de boletos creados.
 * 
 * @author Sara Segura
 * @version 1.0
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BoletoMuseo {
  private double precio;
  private int numeroBoleto;
  private String fechaEmision;
  private static int contador = 0;
  
  /**
   * Constructor que crea un nuevo boleto con el precio especificado.
   * Asigna automáticamente un número único y la fecha actual.
   * @param precio el precio del boleto
   */
  public BoletoMuseo(double precio) {
    this.precio = precio;
    contador++;
    this.numeroBoleto = contador;
    this.fechaEmision = establecerFechaEmisionBoleto();
  }
  
  /**
   * Método privado que establece la fecha de emisión del boleto
   * en formato yyyy-MM-dd usando la fecha actual.
   * 
   * @return la fecha de emisión formateada como String
   */
  private String establecerFechaEmisionBoleto() {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return LocalDate.now().format(f);
  }
  
  /**
   * Obtiene el contador estático de boletos creados.
   * @return el número total de boletos creados
   */
  public static int getContador() {
    return contador;
  }
  
  /**
   * Obtiene el número único del boleto.
   * @return el número del boleto
   */
  public int getNumeroBoleto() {
    return numeroBoleto;
  }
  
  /**
   * Obtiene el precio del boleto.
   * @return el precio del boleto
   */
  public double getPrecio() {
    return precio;
  }
  
  /**
   * Representación en String del objeto BoletoMuseo.
   * @return una cadena con toda la información del boleto
   */
  public String toString() {
    String msg = "BoletoMuseo\n";
    msg += "  Numero: " + numeroBoleto + "\n";
    msg += "  Precio: " + precio + "\n";
    msg += "  Fecha Emision: " + fechaEmision;
    return msg;
  }
}