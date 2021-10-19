package net.javaguides.restfulapitest.model;

import javax.persistence.*;

@Entity
@Table(name = "cards")
public class CreditCard {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    @Id
    private long cardId;

    @Column(name = "card_number")
    private String cardNumber;//will generate a 16 DIGIT sequence later

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private User user;

    public CreditCard() {
        super();
        // TODO Auto-generated constructor stub
    }

    public CreditCard(long cardId, String cardNumber, User user) {
        super();
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.user = user;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getUser() {
        return user.getId();
    }

    public void setUser(User user) {
        this.user = user;
    }

}