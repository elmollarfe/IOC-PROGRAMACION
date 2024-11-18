package EAC3.Enunciat;

public class JocsOlimpicsTest {
    public static void main(String[] args) {

      Pais pais = new Pais("Espanya");
      Atleta atleta = new Atleta("Elena", pais, "Padel");

      // generar 10 medalles pel mateix atleta i país
      
        for (int i = 0; i < 10; i++) {
          new Medalla(1, atleta);
        }


      //Verificar amb una asserció el nombre de medalles de l’atleta és de 10.
      assert atleta.getNumMedalles() == 10 : "Error: no hi han 10 medalles";

      // Generar 3 medalles més pel mateix atleta i país

        
          for (int i = 0; i < 3; i++) {
            int numeroMedalles = atleta.getNumMedalles();
            if(numeroMedalles < 10){
              new Medalla(1, atleta);

            }
        }
          

      // verificar amb una asserció el nombre de medalles del país el 10.
      assert pais.getNumMedalles() == 10 : " Nombre de medalles del pais es més de 10. ";

      // Generar 3 medalles més pel mateix país, però d’un altre atleta diferent.

      Atleta atletaSegon = new Atleta("Cristian", pais, "Jiu-jitsu");

        for (int i = 0; i < 3; i++) {
         new Medalla(1, atletaSegon);
        }

      // Verificar que el nou atleta en té 3, el país 13 i l’atleta anterior segueix amb les 10.
      assert atletaSegon.getNumMedalles() == 3 : "No te 3 de medalles";
      assert pais.getNumMedalles() == 13 : "El pais no te 13 medalles. ";
      assert atleta.getNumMedalles() == 10 : "Error el primer atleta no te 10 medalles";

      // Generar una medalla per un nou atleta d’un nou país

      Pais paisSegon = new Pais("Catalunya");

      Atleta atletaTercer = new Atleta("Didac", paisSegon, "Natacio");

      Medalla medalla = new Medalla(3,atletaTercer);
      
      // Verificar que el nou atleta té 1 medalla, el nou país també en té 1 medalla i que els atletes del primer país segueixen amb 10 i 3 medalles i el país amb 13.

        assert atletaTercer.getNumMedalles() == 1 : "Error: el nombre de medalles no es correcte";
        assert atletaTercer.pais.getNumMedalles() == 1 : "Error: el nombre de medalles del pais Catalunya";
        assert atletaSegon.getNumMedalles() == 3 : "Error: El nombre de medalles del segon atleta no es correcte ";
        assert atleta.getNumMedalles() == 10 : "Error: el nombre de medalles del primer atleta no es correcte";
        assert pais.getNumMedalles() == 13 :  "Error : el nombre de medalles del pais espanya no es correcte"; 
    } 
}
