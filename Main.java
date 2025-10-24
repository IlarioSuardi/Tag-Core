public class Main{
    public static void main(String args[]){
        Core c = new Core();
        System.out.println(c);

        Tag borsa = new Tag();
        borsa.setDescrizione("Borsa");
        borsa.setPosione(new Posizione(0, 1, 2));
        Tag chiavi = new Tag();
        chiavi.setDescrizione("Chiavi");
        chiavi.setPosione(new Posizione(1, 1, 3));
        Tag telefono = new Tag();
        telefono.setDescrizione("Iphone");
        telefono.setPosione(new Posizione(3, 0, 3));

        c.aggiungiAggiorna(borsa);
        c.aggiungiAggiorna(chiavi);
        c.aggiungiAggiorna(telefono);
        System.out.println(c);

        borsa.setDescrizione("Borsa Blu");
        borsa.setPosione(new Posizione(0, 5, 2));
        c.aggiungiAggiorna(borsa);

        System.out.println(c);

        c.elimina(borsa);
        System.out.println(c);

        Tag telefono = new Tag();
        telefono.setDescrizione("Iphone 19");
        c.aggiungiAggiorna(telefono);

        System.out.println(c);

        Tag[] vicini = c.vicini(5);
        System.out.println("Oggetti sotto i 5m: ");

        int i = 0;
        while (i < vicini.length){
            Tag t = vicini[i];
            if (t != null);
                System.out.println(t);
                i++;
        }

        System.out.println("Finito!");
    }
}