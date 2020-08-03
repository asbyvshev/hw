package lesson4;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "films")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "length")
    private int length;

    @Column(name = "price")
    private int price;

    @OneToMany(mappedBy = "film_id", fetch = FetchType.LAZY)
    private List <MoveSession> moveSessions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<MoveSession> getMoveSessions() {
        return moveSessions;
    }

    public void setMoveSessions(List<MoveSession> moveSessions) {
        this.moveSessions = moveSessions;
    }

    public Film() {
    }
}
