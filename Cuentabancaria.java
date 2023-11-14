public class CuentaBancaria {

    
    private int numCuenta;
    private double saldo;
    private String nombreCliente;
    private String email;
    private String numTelefono;
    

    public CuentaBancaria(int numCuenta, double saldo, String nombreCliente, String email, String numTelefono) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.nombreCliente = nombreCliente;
        this.email = email;
        this.numTelefono = numTelefono;
    }
    
    
  


    public int getNumeroCuenta() {
        return numCuenta;
    }
    
    public void setNumeroCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNumeroTelefono() {
        return numTelefono;
    }
    
    public void setNumeroTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
     
     public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se depositaron " + cantidad + " unidades. El saldo actual es de " + saldo + " unidades.");
    }
    
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se retiraron " + cantidad + " unidades. El saldo actual es de " + saldo + " unidades.");
        } else {
            System.out.println("No hay fondos suficientes para realizar el retiro.");
        }
    }


    
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(186750, 18000.0, "melida perez", "melidaperez21u@email.com", "1234-5678");
        
     System.out.println("El saldo actual es de " + cuenta.getSaldo());
     cuenta.depositar(3000.0);
     cuenta.retirar(2000.0);
 }
 
    }
        
    
    
    
    



