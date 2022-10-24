import java.util.Scanner;
public class Principal{
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu(){
        Scanner scan = new Scanner (System.in);
        String menu = ("\n***************************************\n"
            + "1. Digita la información del vehiculo\n"
            + "2. Mostras información de los vehiculos\n"    
            + "3. Mostrar cantidad de vehiculos\n"
            + "4. Mostrar vehiculos verdes\n"
            + "5. Mostras información de los vehiculos de 2000 hasta 2021\n"
            + "6. Digita tipo y valor de sensor\n"
            + "7. Mostrar información de los sensores\n"
            + "8. Mostrar cantidad de sensores\n"
            + "9. Mostrar sensores de tipo temperatura\n"
            + "666. Mostrar sensores de tipo temperatura ordenados por valor\n"
            + "10. Mostrar nuevamente el menú\n"
            + "0. Salir\n");

        System.out.println(menu);

        // Creación del ciclo infinito...
        while(true){

            int num = scan.nextInt();
            switch(num){

                case 0:
                    break;
                
                case 1:
                    if(Vehiculo.posAnadir < 10){
                        System.out.println("\nDigite el modelo del vehículo: ");
                        int modelo = scan.nextInt();
                        System.out.println("Digite la marca del vehículo: ");
                        String marca = scan.next();
                        System.out.println("Digite el valor comercial del vehículo: ");
                        double valorComercial = scan.nextDouble();
                        System.out.println("Digite el color del vehículo: ");
                        String color = scan.next();
                        Vehiculo nuevo = new Vehiculo(modelo, marca, valorComercial, color);
                        Vehiculo.Vehiculos[Vehiculo.posAnadir] = nuevo;
                        Vehiculo.posAnadir ++;
                    
                    }else{
                        
                        System.out.println("\nError base de datos llena");
                    }
                    
                    System.out.println("");
                    break;
                
                case 2:
                    System.out.println("\n"+Vehiculo.toStringVehiculos());
                    break;
                
                case 3:
                    System.out.println("\nLa cantidad de vehículos es: "+Vehiculo.cantidadVehiculos()+"\n");
                    break;
                
                case 4:
                    System.out.println("\n"+Vehiculo.toStringVehiculos("verde"));
                    break;
                
                case 5:
                    System.out.println("\n"+Vehiculo.toStringVehiculos(2000, 2021));
                    break;
                
                case 6:
                    if(Sensor.posAnadir < 8){
                        System.out.println("\nDigite el tipo del sensor: ");
                        String tipo = scan.next();
                        System.out.println("Digite el valor del sensor: ");
                        double valor = scan.nextDouble();
                        Sensor nuevo = new Sensor(tipo, valor);
                        Sensor.Sensores[Sensor.posAnadir] = nuevo;
                        Sensor.posAnadir ++; 
                    
                    }else{
                        
                        System.out.println("\n"+"Error base de datos llena");
                    }
                    
                    System.out.println("");
                    break;
                
                case 7:
                    System.out.println("\n"+Sensor.toStringSensores(Sensor.Sensores, Sensor.posAnadir));
                    break;
                
                case 8:
                    System.out.println("\n"+"La cantidad de sensores es: "+ Sensor.cantidadSensores()+"\n");
                    break;
                    
                case 9: 
                    System.out.println("\n"+Sensor.toStringSensores("temperatura"));
                    break;
                
                case 666:
                    Sensor[] ordenado = Sensor.sensorValor();
                    System.out.println("\n"+Sensor.toStringSensores(ordenado, Sensor.contarTemperatura()));
                    break;
                
                case 10:
                    System.out.println(menu);
                    break;
                default:
                    break;
            }
            if(num == 0){break;}
            System.out.println("\n***************************************\nDigite el numero de la acción que desea ejecutar\n10. Mostrar nuevamente el menú\n\n");
        }
    }
}

