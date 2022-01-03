package org.wecancodeit.com.project.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Waterway {
    @Id
    @GeneratedValue
    private Long id;
    private String waterwayName;
    @Lob
    private String waterwayDesc;
    private String imgUrl;

    @ManyToOne
    private Island island;

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

    public Island getIsland(){
        return island;
    }
}
