import java.util.*;

public class Main {
  public static void main(String[] args) {
    int nVueltas = 0, tiempos = 0, n = 0, tamanio = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Cuantos vehiculos desea ingresar: ");
    try {
      tamanio = scanner.nextInt();
    } catch (Exception e) {
      System.out.println("Error de E/S");
    }
    double promedioTiempos = 0, ListaVehiculos[] = new double[tamanio];
    System.out.println("Ingrese el largo que tiene la pista en kilómetros: ");
      double distancia = scanner.nextDouble();
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
        promedioTiempos += scanner.nextDouble();
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
  }
}