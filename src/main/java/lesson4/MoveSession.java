package lesson4;

import javax.persistence.*;
import java.util.Date;

public class MoveSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "price_mod")
    private double priceMod;

    public MoveSession() {
    }

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film_id;

    public Film getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Film film_id) {
        this.film_id = film_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public double getPriceMod() {
        return priceMod;
    }

    public void setPriceMod(double priceMod) {
        this.priceMod = priceMod;
    }
}
