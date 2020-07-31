package lesson4;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private MoveSession session;

    @Column(name = "cost")
    private int cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MoveSession getSession() {
        return session;
    }

    public void setSession(MoveSession session) {
        this.session = session;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Ticket() {
    }

    @Override
    public String toString() {
        return String.format("Билет № %d Сеанс %t Стоимость %d",id,session.getStartTime(),cost);
    }
}
