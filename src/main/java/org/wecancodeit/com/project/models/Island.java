package org.wecancodeit.com.project.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Island {
    @Id
    @GeneratedValue
    private Long id;
    private String islandName;
    private String islandDesc;
    private String imgUrl;

    @ManyToOne
    private Country country;

    @OneToMany
    private Collection<Waterway> waterways;

    public  Island(){
    }

    public Island(String islandName, String islandDesc, String imgUrl, Waterway waterways) {
        this.islandName = islandName;
        this.islandDesc = islandDesc;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public String getIslandName() {
        return islandName;
    }

    public String getIslandDesc() {
        return islandDesc;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Country getCountry(){
        return country;
    }

    public Collection<Waterway> getWaterways() {
        return waterways;
    }
}
