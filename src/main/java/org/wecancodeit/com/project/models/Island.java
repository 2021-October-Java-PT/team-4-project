package org.wecancodeit.com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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

    public  Island(){
    }

    public Island(String islandName, String islandDesc, String imgUrl) {
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
}
