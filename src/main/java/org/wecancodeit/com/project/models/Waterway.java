package org.wecancodeit.com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Waterway {
    @Id
    @GeneratedValue
    private Long id;
    private String waterwayName;
    private String waterwayDesc;
    private String imgUrl;

//    @OneToMany(mappedBy = "continent")
//    private Collection<Country> countries;

    public Waterway(){
    }

    public Waterway(String continentName, String continentDesc, String imgUrl) {
        this.waterwayName = continentName;
        this.waterwayDesc = continentDesc;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public String getContinentName() {
        return waterwayName;
    }

    public String getContinentDesc() {
        return waterwayDesc;
    }

    public String getImgUrl(){
        return imgUrl;
    }

//    public Collection<Country> getCountries(){
//        return countries;
//    }
}
