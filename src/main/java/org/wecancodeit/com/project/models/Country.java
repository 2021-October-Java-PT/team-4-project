package org.wecancodeit.com.project.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Country {
    @Id
    @GeneratedValue
    private Long id;
    private String countryName;
    private String countryDesc;
    private String imgUrl;

    @ManyToOne
    private Continent continent;

    @OneToMany
    private Collection<Island> islands;

    public Country(){

    }

    public Country(String countryName, String countryDesc, String imgUrl) {
        this.countryName = countryName;
        this.countryDesc = countryDesc;
        this.imgUrl = imgUrl;
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
}
