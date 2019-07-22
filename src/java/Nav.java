/*
TODO:
Oppgave 2)
Implementer klassen nav. Nav skal regne ut hvor mye Arbeidsavklaringspenger en person kan få.
https://www.nav.no/no/Person/Arbeid/Sykmeldt%2C+arbeidsavklaringspenger+og+yrkesskade/arbeidsavklaringspenger-aap--217377#chapter-4

 */

public class Nav {

    public static float GRUNNBELOP = 99858;

    public static Float calculateAAP(Adult adult){
        if (adult.getSalaries().size() == 0){
            return GRUNNBELOP*2;
        }
        return 0F;
    }
}
