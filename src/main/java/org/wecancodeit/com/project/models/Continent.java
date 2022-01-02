package org.wecancodeit.com.project.models;

import ch.qos.logback.core.joran.action.IADataForComplexProperty;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Continent {
    @Id
    @GeneratedValue
    private Long id;
    private String continentName;
    @Lob
    private String continentDesc;
    private String imgUrl;

    @OneToMany(mappedBy = "continent")
    private Collection<Country> countries;

    public Continent(){
    }

    public Continent(String continentName, String continentDesc, String imgUrl) {
        this.continentName = continentName;
        this.continentDesc = continentDesc;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public String getContinentName() {
        return continentName;
    }

    public String getContinentDesc() {
        return continentDesc;
    }

    public String getImgUrl(){
        return imgUrl;
    }

    public Collection<Country> getCountries(){
        return countries;
    }
}
