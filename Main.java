import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int salir=0, nVueltas = 0, tiempos = 0, n = 0, tamanio = 0, opcion=0;
    double distancia, promedioTiempos;
    Scanner scanner = new Scanner(System.in);
    System.out.println("¡Bienvenido!");
    do{
      System.out.println("\tIngrese una opcion: \n\t\t1.Hacer promedio de velocidad.\n\t\t0.Salir");
      try{
        opcion=scanner.nextInt();
      }catch(Exception e){
        System.out.println("Error de E/S");
      }
      switch(opcion){
        case 1:
          nVueltas = 0;
          tiempos = 0;
          n = 0;
          tamanio = 0;
          distancia=0;
          promedioTiempos=0;
          System.out.println("Cuantos vehiculos desea ingresar: ");
          try {
            tamanio = scanner.nextInt();
          } catch (Exception e) {
            System.out.println("Error de E/S");
          }
          double ListaVehiculos[] = new double[tamanio];
          System.out.println("Ingrese el largo que tiene la pista en kilómetros: ");
          try{
              distancia = scanner.nextDouble();
          }catch(Exception e){
            System.out.println("Error de E/S");
          }
          for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese la cantidad de vueltas que realizo el vehículo "+(i+1)+":");
            try {
              nVueltas = scanner.nextInt();
            } catch (Exception e) {
              System.out.println("Error de E/S");
            }
            System.out.println("Ingrese los tiempos de cada vuelta en minutos.");
            for (int v=0; v < nVueltas; v++) {
              System.out.println("Tiempo de vuelta #" + (v + 1));
              try{
                promedioTiempos += scanner.nextDouble();
              }catch(Exception e){
                System.out.println("Error de E/S");
              }
            }
            promedioTiempos = promedioTiempos / nVueltas;
            promedioTiempos = promedioTiempos / 60;
            double velocidad = distancia / promedioTiempos;
            ListaVehiculos[n] = velocidad;
            n++;
          }
          System.out.println("La velocidad promedio de los vehiculos es: ");
          for (int i = 0; i < tamanio; i++) {
            System.out.println("#" + (i + 1) + ": " + ListaVehiculos[i] + " KPH");
          }
          salir=0;
          break;
        case 0:
          System.out.println("¡Gracias por su tiempo!");
          salir=1;
          break;
        default:
          System.out.println("Opcion no valida, vuelva a intentarlo: ");
          salir=0;
      }
    }while(salir!=1);
  }
}