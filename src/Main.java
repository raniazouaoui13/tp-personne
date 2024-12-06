

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(15, 10, 2000);
        Personne personne1 = new Personne("Dupont", "Jean", date1);

        personne1.afficher();
        personne1.afficherDateNaissance();

        personne1.setNom("Durand");
        personne1.setPrenom("Paul");
        Date nouvelleDate = new Date(1, 1, 1995);
        personne1.setDateNaissance(nouvelleDate);

        System.out.println("Après modification :");
        personne1.afficher();
        personne1.afficherDateNaissance();
    }
}