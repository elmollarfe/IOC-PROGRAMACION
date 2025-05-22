import java.util.Arrays;
import java.util.Comparator;

public class examen1 {

public static void main(String[] args) {
float[] arrayNotes = {9.75f, 5.25f, 6.75f, 4.20f, 7.25f, 2.5f, 8.25f,
1.25f};
float acumulat = 0, mitjana = 0;
Arrays.sort(arrayNotes);
int ordenarNota = arrayNotes.length - 1;
for (int i = 0; i < arrayNotes.length; i++) {
System.out.println("Nota "+i+": "+arrayNotes[ordenarNota]);
ordenarNota --;
acumulat = acumulat + arrayNotes[i];
}
mitjana = acumulat / arrayNotes.length;
System.out.println("La nota mitjana és: " + mitjana);
}
}

