package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "depense", schema = "suivi_depenses")
public class Depense {
    @Id
    @GeneratedValue
    private int id;
    private String description;
    @Column(name = "montant_rembourse")
    private Double montantRembourse;
    @Column(name = "montant_depense")
    private Double montantDepense;
    private Double ecart;
    @ManyToOne
    private OrdreMission ordreMission;

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
     * @return the montantRembourse
     */
    public Double getMontantRembourse() {
        return montantRembourse;
    }

    /**
     * @param montantRembourse
     *            the montantRembourse to set
     */
    public void setMontantRembourse(Double montantRembourse) {
        this.montantRembourse = montantRembourse;
    }

    /**
     * @return the montantDepense
     */
    public Double getMontantDepense() {
        return montantDepense;
    }

    /**
     * @param montantDepense
     *            the montantDepense to set
     */
    public void setMontantDepense(Double montantDepense) {
        this.montantDepense = montantDepense;
    }

    /**
     * @return the ecart
     */
    public Double getEcart() {
        return ecart;
    }

    /**
     * @param ecart
     *            the ecart to set
     */
    public void setEcart(Double ecart) {
        this.ecart = ecart;
    }

    /**
     * @return the ordreMission
     */
    public OrdreMission getOrdreMission() {
        return ordreMission;
    }

    /**
     * @param ordreMission
     *            the ordreMission to set
     */
    public void setOrdreMission(OrdreMission ordreMission) {
        this.ordreMission = ordreMission;
    }

}
