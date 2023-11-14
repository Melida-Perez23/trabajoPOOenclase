public class ClienteVIP {
    private String nombre;
    private static double limiteCredito;
    private String correoElectronico;

  
    public ClienteVIP() {
        this("Nombre usado",1000000 , "melidaperez21u@gmail.com");
    }

   
    public ClienteVIP(String nombre, double limiteCredito) {
        this(nombre, limiteCredito, "melidaperez21u@gmail.com");
    }


    public ClienteVIP(String nombre, double limiteCredito, String correoElectronico) {
        this.nombre = nombre;
        ClienteVIP.limiteCredito = limiteCredito;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }


public static void main(String[] args) {
    ClienteVIP cliente1 = new ClienteVIP();
    ClienteVIP cliente2 = new ClienteVIP("melida perez", 5000);
    ClienteVIP cliente3 = new ClienteVIP("rachel quintero", 10000, "rachelquintero22v@example.com");

    System.out.println("Nombre del cliente 1: " + cliente1.getNombre());
    System.out.println("Límite de crédito del cliente 2: " + cliente2.getLimiteCredito());
    System.out.println("Correo electrónico del cliente 3: " + cliente3.getCorreoElectronico());
}

}



