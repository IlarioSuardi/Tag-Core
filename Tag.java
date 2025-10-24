public class Tag{
    
    private int codiceUnivoco;
    private String descrizione;
    private Posizione posizione;
    private float distanza;
   
    private static int counter = 0;

    public Tag(){
        this.codiceUnivoco = counter++;
        this.posizione = new Posizione();
        this.distanza = 0;
    }

    //Set Descrizione
    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }

    public void setPosizione(Posizione posizione){
        this.posizione=posizione;
    }

    //get CodiceUnivoco
    public int getCodiceUnivoco(){
        return this.codiceUnivoco;
    }

    // getPosizione
    public Posizione getPosizione(){
        return this.posizione;
    }

    public float getDistanza(){
        return this.distanza;
    }

    public void aggiornaDistanza(){
        Posizione origine = new Posizione(0, 0, 0);
        this.distanza = (float) posizione.distanzaDa(origine);
    }

    public String toString(){
        return "Tag[CodiceUnivoco: " + this.codiceUnivoco + ", Descrizione: " + this.descrizione + "]";
    }
}