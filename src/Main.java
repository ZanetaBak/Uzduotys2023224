import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> surnames = new ArrayList<>();

        //Student studentas = new Student();
        //studentas.name = "Petras";
        //studentas.surname = "Kurmelis";
        //studentas.age = 55;
        //studentas.isMan = true;

        //System.out.println(studentas.name + " " + studentas.surname);

        //Student studentas2 = new Student();
        //studentas2.name = "Viktoras";
        //studentas2.surname = "Grybas";
        //studentas2.age = 45;
        //studentas2.isMan = true;

        //System.out.println(studentas2.name + " " + studentas2.surname);


//===================== 1 uzd ==============
        System.out.println("======== 1 uzd ==========");
        // Sukurti klasę Book.
        //Properties: title, pages, releaseYear
        //visi properties turi būti inkapsuliuoti.
        //sukurti 3 objektus su reikšmėmis naudojantis tuščiu konstruktoriu, ir tris naudojantis pilnu konstuktoriu.
        //sudėti juos į knygų masyvą.(arrayList)
        //prasukti ciklą per masyvą ir atspausdinti knygas (naudojam toString() overidintą metodą)

        Book knyga1 = new Book();
        knyga1.setTitle("Endeavour");
        knyga1.setPages(235);
        knyga1.setReleaseYear(2023);

        Book knyga2 = new Book();
        knyga2.setTitle("Rubber duck");
        knyga2.setPages(99);
        knyga2.setReleaseYear(2022);

        Book knyga3 = new Book();
        knyga3.setTitle("New York Cult Recipes");
        knyga3.setPages(450);
        knyga3.setReleaseYear(2021);


        ArrayList<Book> books = new ArrayList<>();
        books.add(knyga1);
        books.add(knyga2);
        books.add(knyga3);


        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }


//===================== 2 uzd ==============
        System.out.println("======== 2 uzd ==========");
        // Sukurti klasę Plant
        //Visi laukai turi būti private, turėti getterius ir setterius.
        //konstruktoriai - 2. tuščias ir su visais fieldais.
        //ToString()
        //Klasės laukai: Pavadinimas, lotyniskas pavadinimas, boolean vienmetis, kokiam zemyne auga,
        //suaugusio augalo aukstis metrais, ar valgomas?
        //Maine susikuriam ArrayList saugoti augalams. sukuriame 4 augalus (2x2 pagal konstruktorius)
        //prasukti ciklą ir atspausdinti augalus


        Plant plant1 = new Plant();
        plant1.setName("Šaltalankis");
        plant1.setNameInLatin("Hippophae");
        plant1.setAnnual(false);
        plant1.setContinentOfDistribution("Eurazija");
        plant1.setGrowsUpToMeters(6);
        plant1.setEdible(true);


        Plant plant2 = new Plant();
        plant2.setName("Graikinis riešutmedis");
        plant2.setNameInLatin("Juglans regia");
        plant2.setAnnual(false);
        plant2.setContinentOfDistribution("Eurazija, Amerika, Australija");
        plant2.setGrowsUpToMeters(35);
        plant2.setEdible(true);


        Plant plant3 = new Plant();
        plant3.setName("Europinis alyvmedis");
        plant3.setNameInLatin("Olea europaea");
        plant3.setAnnual(false);
        plant3.setContinentOfDistribution("Eurazija");
        plant3.setGrowsUpToMeters(12);
        plant3.setEdible(true);



        Plant plant4 = new Plant();
        plant4.setName("Paprastasis kaštonas");
        plant4.setNameInLatin("Aesculus hippocastanum");
        plant4.setAnnual(false);
        plant4.setContinentOfDistribution("Eurazija, Amerika");
        plant4.setGrowsUpToMeters(39);
        plant4.setEdible(false);

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);
        plants.add(plant4);

        for (int i = 0; i < plants.size(); i++) {
            System.out.println(plants.get(i));
        }
        


// ===============End of the code =================
    }
    // ===============End of the file =================
}