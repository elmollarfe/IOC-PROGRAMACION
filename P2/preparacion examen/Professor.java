public class Professor extends Persona{

    protected String especialitat; 

    public Professor(String nom, String especialitat){
        super(nom);
        this.especialitat = especialitat;
    }

    @Override

    protected String descriure(){
        return "Professor/a: " + nom + "- Especialitat: " + especialitat; 
    }
    
}
