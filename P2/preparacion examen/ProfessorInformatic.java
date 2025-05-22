import java.lang.runtime.SwitchBootstraps;

public class ProfessorInformatic extends Professor{

    protected String subEspecialitat;
    
    protected ProfessorInformatic (String nom, String especialitat, String subEspecialitat){
        super(nom, especialitat);
        this.especialitat = especialitat;
    }

    protected ProfessorInformatic (String nom, String subEspecialitat){
        this(nom , "Informàtic", subEspecialitat);

    }

    @Override

    public String descriure(){
        return super.descriure() + " – Desenvolupament " + subEspecialitat;
    }

    public void impartirSessio(){
        switch(subEspecialitat){
            case "Front-end":
            System.out.println("Avui aprendrem a fer servir JavaScript per fer interactiva una web.");
            break;
            case "Back-end":
            System.out.println("Estem creant una API REST amb Java i Spring Boot.");
            break;
        }
    }
    
}
