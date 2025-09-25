/**
 * Clase principal que demuestra el funcionamiento del sistema de ventas de boletos del museo.
 * Crea personas, boletos y registra las ventas del día, mostrando la información resultante.
 * 
 * @author Sara Segura
 * @version 1.0
 */
public class PrincipalMuseo {
  
  /**
   * Método principal que ejecuta la demostración del sistema.
   * Crea tres personas con sus respectivos boletos, registra las ventas
   * y muestra la información de cada objeto creado.
   * 
   * @param args argumentos de la línea de comandos (no utilizados)
   */
  public static void main(String[] args) {
    // Creación de objetos Persona
    Persona a, b, c;
    a = new Persona("Nicolás Maduro", "666-6");
    b = new Persona("Donald Trump", "333-3");
    c = new Persona("Claudia Sheinbaum", "777-7");
    
    // Creación de objetos BoletoMuseo con diferentes precios
    BoletoMuseo b1, b2, b3;
    b1 = new BoletoMuseo(4500.0);
    b2 = new BoletoMuseo(6000.0);
    b3 = new BoletoMuseo(5800.0);
    
    // Creación del objeto VentaDelDia para registrar las ventas
    VentaDelDia vd;
    vd = new VentaDelDia();
    
    // Asignación de boletos a personas y registro de ventas
    a.asignarBoleto(b1);
    System.out.println("Detalle del primer objeto Persona: " + a.toString());
    vd.registrarVentaBoleto(b1);
    
    b.asignarBoleto(b2);
    System.out.println("Detalle del segundo objeto Persona: " + b.toString());
    vd.registrarVentaBoleto(b2);
    
    c.asignarBoleto(b3);
    System.out.println("Detalle del tercer objeto Persona: " + c.toString());
    vd.registrarVentaBoleto(b3);
    
    // Mostrar información global y resumen de ventas
    System.out.println("Contador global de boletos creados: " + BoletoMuseo.getContador());
    System.out.println("Detalle de la Venta Del Día: " + vd.toString());
  }
}