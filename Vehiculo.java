public class Vehiculo {
    
    // Atributos publicos 
    public static Vehiculo[] Vehiculos = new Vehiculo[10];
    public static int tamano = 10;
    public static int posAnadir = 0;

    // Atributos privados
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;


    // Métodos

    // Constructores
    public Vehiculo(){} 

    public Vehiculo(int mo, String ma, double va){
        this(mo, ma, va, "verde");
    }

    public Vehiculo (int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;

    }

    // Getters y setters
    public int getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getValorComercial() {
        return this.valorComercial;
    }

    public String getColor() {
        return this.color;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Metodos ToString
    
    @Override
    public static String toString(Vehiculo n){
        // Metodo toString para la informacion de un carro
        String r = "El modelo del vehículo es: "+n.getModelo()+"\n"+ "La marca del vehículo es: "+n.getMarca()+"\n"+ "El valor comercial del vehículo: "+n.getValorComercial()+"\n"+ "El color del vehículo: "+n.getColor()+"\n";
        return r;
    }
    
    public static String toStringVehiculos(){
        // Metodo toStringVehiculos para mostrar la info de todos los carros
        String entrega = "";
        for (int i = 0; i < posAnadir; i++){
            entrega = entrega + Vehiculo.toString(Vehiculo.Vehiculos[i])+ "\n";
        }
        return entrega;
    }

    public static String toStringVehiculos(String color){
        // Metodo toStringVehiculos para mostrar la info de todos los carros con un color especifico 
        String entrega = "";
        for (int i = 0; i < posAnadir; i++){
            if(Vehiculo.Vehiculos[i].getColor().equals(color)){
                entrega = entrega + Vehiculo.toString(Vehiculo.Vehiculos[i])+ "\n";
            }
        }
        return entrega;
    }

    public static String toStringVehiculos(int ini, int fin){
        // Metodo toStringVehiculos para mostrar la info de todos los carros con un rango de modelo
        String entrega = "";
        for (int i = 0; i< posAnadir; i++){
            if(Vehiculo.Vehiculos[i].getModelo() >= ini && Vehiculo.Vehiculos[i].getModelo() <= fin){
                entrega = entrega + Vehiculo.toString(Vehiculo.Vehiculos[i])+ "\n";
            }
        }
        return entrega;
    }

    // metodo que devuelve la cantidad de carros
    public static int cantidadVehiculos(){
        return Vehiculo.posAnadir;
    }
}
