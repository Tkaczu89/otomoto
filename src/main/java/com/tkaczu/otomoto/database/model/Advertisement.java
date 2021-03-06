package com.tkaczu.otomoto.database.model;

import org.hibernate.annotations.Cascade;


import javax.persistence.*;

@Entity
@Table(name = "advertisements")
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "advert_id")
    private Integer advertId;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "user_id")
    private User user;

    public Advertisement() {
    }

    public Integer getAdvertId() {
        return advertId;
    }

    public void setAdvertId(Integer advertId) {
        this.advertId = advertId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "advertId=" + advertId +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", car=" + car +
                ", user=" + user +
                '}';
    }
}
