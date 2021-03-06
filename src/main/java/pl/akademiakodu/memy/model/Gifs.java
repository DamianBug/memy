package pl.akademiakodu.memy.model;

/**
 * Created by macie on 02.08.2017.
 */
public class Gifs {

    private String name;
    private boolean favorite;
    private String owner;
    private Long id;
    private Cate categoryName;

    public Gifs(String name, boolean favorite, String owner, Cate categoryName) {
        this.name = name;
        this.favorite = favorite;
        this.owner = owner;
        this.categoryName = categoryName;
    }

    public Gifs(String name, boolean favorite, String owner) {
        this.name = name;
        this.favorite = favorite;
        this.owner = owner;
    }

    public Gifs(String name) {
        this.name = name;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Gifs() {
    }


    public Gifs(String name, boolean favorite) {
        this.name = name;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Cate getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Cate categoryName) {
        this.categoryName = categoryName;
    }
}

