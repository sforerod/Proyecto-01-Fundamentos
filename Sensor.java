public class Sensor{
// Atributos
    public static Sensor [] Sensores = new Sensor[8];
    public static int tamano = 8;
    public static int posAnadir = 0;
    private String tipo;
    private double valor;

    // Métodos

    public Sensor(){}

    public Sensor(String ti, double va){
        this.tipo = ti;
        this.valor = va;
    }

    //Getters y Setters

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getValor() {
        return this.valor;
    }

    // Metodos toStrings
    @Override
    public static String toString(Sensor n){
        // Metodo que devulve la informacion de un Sensores 
        return "El tipo del sensor es: "+n.getTipo()+"\n"+ "El valor del sensor es: "+n.getValor()+"\n";
    }

    public static String toStringSensores(String tipo){
        // Metodo que devuelve la información de todos los sensores con un tipo escifico
        String entrega = "";
        for (int i = 0; i < posAnadir; i++){
            if(Sensor.Sensores[i].getTipo().equals(tipo)){
                entrega = entrega + Sensor.toString(Sensor.Sensores[i])+ "\n";
            }
        }
        return entrega;
    }

    public static String toStringSensores(Sensor n[], int tam){
        // Metodo toStringSensores sobrecargado que devuelve la información de todos lo sensores y con tamaño de lista especifico
        String entrega = "";
        for (int i = 0; i < tam; i++){
            entrega = entrega + Sensor.toString(n[i])+ "\n";
        }
        return entrega;
    }

    public static int cantidadSensores(){
        return Sensor.posAnadir;
    }

    // Metodo Extra 
    public static int contarTemperatura(){
        // Metodo que cuenta cuantos sensores hay de tipo temperatura 
        int num = 0;
        for (int i = 0; i < Sensor.posAnadir; i++){
            if(Sensor.Sensores[i].getTipo().equals("temperatura")){
                num ++;
            }
        }
        return num;
    }

    // Metodo para ordenar una lista de sensores con un tipo especifico de sensor
    public static Sensor[] sensorValor(){
        Sensor n[] = new Sensor[contarTemperatura()];
        int num = 0;
        for (int i = 0; i < Sensor.posAnadir; i++){
            if(Sensor.Sensores[i].getTipo().equals("temperatura")){
                n[num] = Sensor.Sensores[i];
                num ++;
            }
        }
        
        // Método burbuja
        for(int i = 0; i < Sensor.contarTemperatura(); i++){
            for(int j = 0; j < Sensor.contarTemperatura() - 1; j++){
                Sensor aux = n[j];
                if (n[j].getValor() > n[j + 1].getValor()){
                    n[j] = n[j +1];
                    n[j+1] = aux;
                }
            }
        }
        return n;
    }
}