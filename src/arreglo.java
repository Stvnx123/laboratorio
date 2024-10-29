import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arreglo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = Integer.parseInt(br.readLine());
        String[] arregloCadenas = new String[cantidadEstudiantes];
        int[][] notasEstudiantes = new int[cantidadEstudiantes][4];

        for (int i = 0; i < arregloCadenas.length; i++) {
            System.out.print("Ingresa el nombre del estudiante: ");
            String value = br.readLine();
            GuardarValor(arregloCadenas, i, value);

            System.out.println("Debes ingresar las 4 notas del estudiante (0-20):");
            for (int j = 0; j < notasEstudiantes[i].length; j++) {
                int nota;
                while (true) {
                    nota = Integer.parseInt(br.readLine());
                    if (nota >= 0 && nota <= 20) {
                        notasEstudiantes[i][j] = nota;
                        break;
                    } else {
                        System.out.print("Nota inválida. Ingrese nuevamente la nota (0-20): ");
                    }
                    // Validaciones:
                    // Las notas son de 0 a 20
                    // Los alumnos deben tener al menos nombre y apellido

                    // PASO 1: INGRESA LA CANTIDAD DE ESTUDIANTES
                    // PASO 2: INGRESA LAS NOTAS DEL ESTUDIANTE
                    // PASO 3: CALCULA EL PROMEDIO DEL ESTUDIANTE
                    // PASO 3: CALCULA LA NOTA MAS ALTA
                    // PASO 3: CALCULA LA NOTA MAS BAJA
                    // PASO 3: CALCULA LA MEDIA


                }

            }
        }

        // Imprimir resultados
        ImprimirResultados(arregloCadenas, notasEstudiantes);
    }

    private static int CalcularPromedio(int[] notas) {
        int sumaTotal = 0;
        for (int nota : notas) {
            sumaTotal += nota;
        }
        return sumaTotal / notas.length;
    }

    private static void GuardarValor(String[] arreglo, int position, String value) {
        if (arreglo.length <= position) return;
        arreglo[position] = value;
    }

    private static void ImprimirResultados(String[] nombres, int[][] notas) {
        for (int i = 0; i < nombres.length; i++) {
            int promedio = CalcularPromedio(notas[i]);
            int notaMasAlta = CalcularNotaMasAlta(notas[i]);
            int notaMasBaja = CalcularNotaMasBaja(notas[i]);

            System.out.println("Estudiante: " + nombres[i]);
            System.out.println("Promedio: " + promedio);
            System.out.println("Nota más alta: " + notaMasAlta);
            System.out.println("Nota más baja: " + notaMasBaja);
            System.out.println();
        }
    }

    private static int CalcularNotaMasAlta(int[] notas) {
        int maxima = notas[0];
        for (int nota : notas) {
            if (nota > maxima) {
                maxima = nota;
            }
        }
        return maxima;
    }

    private static int CalcularNotaMasBaja(int[] notas) {
        int minima = notas[0];
        for (int nota : notas) {
            if (nota < minima) {
                minima = nota;
            }
        }
        return minima;
    }

    private static double CalcularMedia(int[][] notas) {
        int sumaTotal = 0;
        int totalNotas = 0;

        for (int[] estudianteNotas : notas) {
            for (int nota : estudianteNotas) {
                sumaTotal += nota;
                totalNotas++;
            }
        }
        return (double) sumaTotal / totalNotas;
    }
}