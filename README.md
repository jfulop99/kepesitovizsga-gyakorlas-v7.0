# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztőeszközt használd!
Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! A `pom.xml` tartalmát nyugodtan át lehet másolni.
Projekt, könyvtár, repository neve legyen: `kepesitovizsga-gyakorlas-v7.0`.
GroupId: `training`, artifactId: `kepesitovizsga-gyakorlas-v7.0`. Csomagnév: `hu.nive.ujratervezes.kepesitovizsga`.

A feladatok megoldásához ajánlom figyelmedbe a cheat sheetet:

https://github.com/Training360/strukturavalto-java-public/blob/master/cheet-sheet/cheet-sheet.md

Először másold át magadhoz a teszteseteket, majd commitolj azonnal!

A négy (de ötnek számító) feladatra 3 órád van összesen!

Oldd meg a feladatokat, minden feladat megoldását egy külön commitban
add be!
Ha letelik az idő az első commitodhoz képest és nem fejezted be, megint commitolj, akkor is,
ha nem vagy kész! Utána nyugodtan folytathatod a megoldást, akár több órát is
ülhetsz felette, ha kész vagy, commitolj!

## Szép hosszú szavak - még egyszer ugyanaz, de megfordítva

A FineLongWordOnceAgain osztályban írj egy metódust, amely egy tömböt add vissza. Ez a tömb a következőhöz hasonló formában
kell, hogy tartalmazzon egy szép hosszú szót:
```
EXAM
XAMP
AMPL
MPLE
```
A metódus neve legyen `getFineLongWordOnceAgainButNowInAReverseWay()` (ha már "szép hosszú szó" :) ), és paraméterként 
várja magát a szót, valamint azt, hogy hány betű szélességben adja vissza a szót (a sorok száma ugye innentől kezdve adott lesz). 
Ellenőrizz rá arra is, hogy ez alapján a szám alapján a feladat megoldható-e!

## Törtek egyszerűsítése

A FractionReduction osztályba írj egy metódust, amely a következő feladat megoldását adja vissza:
Hány olyan 1-nél kisebb pozitív törtszám van, amelynek nevezője 144 és nem egyszerűsíthető?
(Ha esetleg valaki nem emlékszik a matekórákról: a tört egyszerűsítése azt jelenti, hogy a számlálóját
és a nevezőjét ugyanazzal a számmal osztjuk el egyszerre.)

## Szülői értekezlet

A múltkori állatkert azóta egy kicsit kibővült, és most már sokkal többféle állatnak ad otthont. Ezért elindították az
örökbefogadási programjukat, amelynek keretében bárki egy jelképes összegért egy általa szabadon választott állat jelképes 
örökbefogadó szülőjévé válhat. Van is már néhány lelkes jelentkező, akiket egy adatbázisban tárolnak (név, e-mail cím,
örökbefogadott állat és örökbefogadás dátuma adatokkal). Az állatkert a kapott támogatásért cserébe évi egyszer egy szülői 
értekezletet tart az örökbefogadóknak, amikor azok arra a napra ingyen belépőt kapnak és még egy beszámolót is meghallgathatnak
kedvencük viselt dolgairól. (Nem vicc, ilyet tényleg csinálnak, pl. a budapesti Állatkertben. :) ) Erre az alkalomra külön
meghívót is kiküldenek minden érintettnek. Az esemény stílusosan az Állatok Világnapján, 2021. október 4-én lesz, délután 5-kor.

A te feladatod az összes ilyen meghívólevél szövegének a legenerálása a megadott template fájl alapján 
(`src/main/resources/conferenceforadoptiveparents.txt`). A metódus neve: `getTextsOfLetters(String filename)`. Fontos,
hogy ez úgy valósuljon meg, hogy ha később bekerülnek még újabb támogatók az adatbázisba, akkor a kódon ne kelljen
semmit módosítani.

Ezenkívül (csak úgy, gyakorlásként) implementáld a következő metódusokat is:
- `getFirstAdoption()` : visszaadja az első örökbefogadást (állat, dátum).
- `getAnimalNamesReverseOrdered()` : visszaadja egy adatszerkezetben az összes, eddig örökbefogadott állat nevét, fordított
   ABC-sorrendben.
- `getExactPerson(String email)` : megkeres egy konkrét örökbefogadó szülőt az e-mail címe alapján.

## Képesítővizsga

Képzeljük el, hogy van egy vizsga (Exam), ami egyelőre tényleg csak a képzeletünkben létezik, de játsszunk el a gondolattal, hogy
ez a vizsga valamikor, valami távoli galaxisban kétféle formában is megvalósulhat: írásbeli- (TheoryTestExam) és projektvizsga (PracticalTestExam).
Minden ilyen vizsgának lesz neve, kezdési ideje, időtartama, valamint mindegyiken egy órával előbb kell megjelenni a 
személyazonosítás céljából.
A következő metódusokat valósítsd meg:
`getBeginTimeOfExam()` : azt az időt adja vissza, amikor legelőször jelen kell lenni (az azonosítás kezdetét).
`getEndTimeOfExam()` : a vizsga befejezési idejét adja vissza.
`getExamsInChronologicalOrder(List<Exam> exams)` : megkapja a megrendezendő vizsgák listáját és kezdési időpont szerinti
sorrendbe rendezve adja vissza.
`Map<String, LocalDateTime> getExamsBySpecialPredicate(List<Exam> exams)` : ennek a metódusnak kétféle megvalósulása is legyen:
a TheoryTestExam osztályban adjon vissza egy kollekciót a fejlesztőknek szóló vizsgákból, a PracticalTestExam osztályban pedig
egy kollekciót a délután megtartandó vizsgákból. (Igen, tudatában vagyok, hogy ennek a szétválasztásnak nincs semmi
értelme, de ettől még remekül lehet vele gyakorolni pár dolgot. :) )

Mindenkinek eredményes felkészülést kívánok!