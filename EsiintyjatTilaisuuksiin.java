import java.util.Date;

// kts. muistiinpanot. public vai private class?

public class EsiintyjatTilaisuuksiin {
    /* Määritellään sovellus, jonka avulla välitetään esiintyjiä tilaisuuksiin.
    - useita esiintyjiä
    - jokaisella erityisala
    - asiakas rekisteröityy
    - esiintyjän varaus tilaisuuteen
    - tilaisuudella tulee olla tyyppi (pihajuhla, syntymäpäivä, joulu)
    - yksi esiintyjä per tilaisuus
    - esiintyjälle palkkio
     */

    private class Esiintyja {
        String nimi;
        String puhnro;
        String ala;
        double palkkio;
    }

    private class Asiakas {
        String nimi;
        String puhnro;
        String asnro; //asiakasnumero erottamaan asiakkaat toisistaan

    }

    private class Juhla {
        /*olisiko parempi näin omana olionaan, vai sittenkin suoraan asiakkaan alla?
        Yhtäältä tämä tieto on tarpeellinen asiakastietojen yhteydessä, mutta toisaalta ohjeissa
        käskettiin palastella tietoja omiin luokkiinsa. Lisäksi asiakastietoja voisi ehkä
        olla enemmänkin, jolloin menisi ehkä turhan monimutkaiseksi.
         */
        String tilaisuus; //juhlan tyyppi tähän
        Date paivamaara; //juhlan pvm tähän
    }

    private class Varausjarjestelma {

    }
    private class VarausjarjestelmaUI {

    }

}
