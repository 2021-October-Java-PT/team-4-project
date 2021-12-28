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

    public Waterway(String waterwayName, String waterwayDesc, String imgUrl) {
        this.waterwayName = waterwayName;
        this.waterwayDesc = waterwayDesc;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public String getWaterwayName() {
        return waterwayName;
    }

    public String getWaterwayDesc() {
        return waterwayDesc;
    }

    public String getImgUrl(){
        return imgUrl;
    }

//    public Collection<Country> getCountries(){
//        return countries;
//    }
}
