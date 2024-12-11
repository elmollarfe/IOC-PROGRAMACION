public class ProvaCompara {
        public static void main(String[] args) {
            // Creem una instància de la classe Compara per provar el mètode mesGran

            Compara compara = new Compara();
            int nombreMesgran = compara.mesGran(5,10);
            int nombre = compara.mesGran(3,6);

            
    
            // Casos de prova utilitzant assercions per verificar que mesGran funcioni correctament
            assert nombreMesgran == 5 : "Error: s'esperava 10 per als valors 5 i 10";
            assert nombre == 6 : "Error: s'esperava el valor més gran 6";

            System.out.println("Tots els casos de prova han passat correctament");
        }
    }
