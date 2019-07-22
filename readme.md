#Arbeidsavklaringspenger fra NAV
Litt av oppgaven går ut på å identifisere hvilke regler som finnes for arbeidsavklaringspenger i NAV. Kandidaten skal derfor finne reglene og implementere dette.

##Oppgaver
- Fullfør de tomme metodene i klassen Person
- Fullfør metoden calculateAAP() i klassen Nav. Denne metoden skal returnere hvor mye en person vil få i Arbeidsavklaringspenger. Det er ekstremt mange regler som kalkulerer AAP, vi fokuserer på de største/viktigste elementene, som tidligere lønn, barn og maksbeløp.

###Regler
- Arbeidsavklaringspenger blir kalkulert basert på 66% av lønnen det siste året, eller 66% av lønnen de siste 3 årene. 
- Man kan ikke motta mer enn 6G i AAP. 
- Man kan maks få arbeidsavklaringspenger i 3 år. 
- Dersom du ikke har hatt inntekt de siste 3 årene vil du få minsteytelse på 2G. 
- Dersom du er "ung ufør", altså under 26 år, vil du få 2,44G. 
- Barnetillegget er på 27kr per barn 5 dager i uker.
