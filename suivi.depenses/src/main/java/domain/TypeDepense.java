package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TypeDepense {
    @Id
    @GeneratedValue
    private int id;
    private String description;
    private Double montant;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the montant
     */
    public Double getMontant() {
        return montant;
    }

    /**
     * @param montant
     *            the montant to set
     */
    public void setMontant(Double montant) {
        this.montant = montant;
    }
}
