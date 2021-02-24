package com.example.demo.carEntity;

import javax.persistence.*;

@Entity
@Table(name = "cars", schema = "public")
public class CarEntity {

    public CarEntity() {
    }

    public CarEntity(String nazwa, String dataZakupu, String kolor) {
        this.nazwa = nazwa;
        this.dataZakupu = dataZakupu;
        this.kolor = kolor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "data_zakupu")
    private String dataZakupu;

    @Column(name = "kolor")
    private String kolor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getDataZakupu() {
        return dataZakupu;
    }

    public void setDataZakupu(String dataZakupu) {
        this.dataZakupu = dataZakupu;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
}
