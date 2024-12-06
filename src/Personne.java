

public class Personne {
    private String nom;
    private String prenom;
    private Date dateNaissance;

    public Personne(String nom, String prenom, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom);
    }

    public void afficherDateNaissance() {
        dateNaissance.afficherDate();
    }
}