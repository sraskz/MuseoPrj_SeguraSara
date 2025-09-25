/**
 * Clase que representa las ventas de boletos de museo para un día específico.
 * Mantiene un registro de todos los boletos vendidos en una fecha y permite
 * calcular el total de ventas del día.
 * 
 * @author Sara Segura
 * @version 1.0
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class VentaDelDia {
  private String fechaDeLaVenta;
  private List<BoletoMuseo> boletosVendidos;
  
  /**
   * Constructor que crea una nueva venta del día con la fecha actual.
   * Inicializa la lista de boletos vendidos vacía.
   */
  public VentaDelDia() {
    fechaDeLaVenta = establecerFechaDeLaVenta();
    boletosVendidos = new ArrayList<>();
  }
  
  /**
   * Registra un boleto vendido en la venta del día.
   * 
   * @param boleto el boleto que se ha vendido
   */
  public void registrarVentaBoleto(BoletoMuseo boleto) {
    boletosVendidos.add(boleto);
  }
  
  /**
   * Calcula el total de ventas del día sumando los precios de todos los boletos vendidos.
   * 
   * @return el monto total de ventas del día
   */
  public double calcularTotalVentaDelDia() {
    double total = 0.0;
    for (BoletoMuseo b : boletosVendidos) {
      total += b.getPrecio();
    }
    return total;
  }
  
  /**
   * Método privado que establece la fecha de la venta en formato yyyy-MM-dd.
   * 
   * @return la fecha actual formateada como String
   */
  private String establecerFechaDeLaVenta() {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return LocalDate.now().format(f);
  }
  
  /**
   * Representación en String del objeto VentaDelDia.
   * Incluye información de la fecha, cantidad de boletos, detalle de cada boleto
   * y el total de ventas del día.
   * 
   * @return una cadena con toda la información de la venta del día
   */
  public String toString() {
    String msg = "VentaDelDia\n";
    msg += "  Fecha: " + fechaDeLaVenta + "\n";
    msg += "  Cantidad de boletos: " + boletosVendidos.size() + "\n";
    msg += "  Detalle:\n";
    for (BoletoMuseo b : boletosVendidos) {
      msg += "    - Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n";
    }
    msg += "  Total: " + calcularTotalVentaDelDia();
    return msg;
  }
}