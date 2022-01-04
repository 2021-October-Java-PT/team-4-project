package org.wecancodeit.com.project.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Country {
    @Id
    @GeneratedValue
    private Long id;
    private String countryName;
    @Lob
    private String countryDesc;
    private String imgUrl;

    @ManyToOne
    private Continent continent;

    @OneToMany
    private Collection<Island> islands;

    public Country(){

    }

    public Country(String countryName, String countryDesc, String imgUrl, Continent continent, Island...islands) {
        this.countryName = countryName;
        this.countryDesc = countryDesc;
        this.imgUrl = imgUrl;
        this.continent=continent;
        this.islands=new ArrayList<>(Arrays.asList(islands));
    }

    public Long getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryDesc() {
        return countryDesc;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Collection<Island> getIslands() {
        return islands;
    }

    public Continent getContinent(){
        return continent;
    }

}
