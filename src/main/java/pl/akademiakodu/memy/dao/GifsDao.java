package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gifs;
import java.util.ArrayList;
import java.util.List;



public class GifsDao implements ShowGifs {
    static List<Gifs> gifs = new ArrayList<>();

    static {
        gifs.add(new Gifs("android-explosion", true,"Maciek"));
        gifs.add(new Gifs("ben-and-mike", false, "Bartek"));
        gifs.add(new Gifs("book-dominos", false, "Magda"));
        gifs.add(new Gifs("compiler-bot", true, "Czołgowski"));
        gifs.add(new Gifs("cowboy-coder", false, "Toldo"));
        gifs.add(new Gifs("infinite-andrew", false, "Grzybu"));
    }

    @Override
    public List<Gifs> showall() {
        return gifs;
    }

    @Override
    public List<Gifs> showfav() {

        List<Gifs> gifsfav = new ArrayList<>();

        for (int i = 0; i < gifs.size(); i++) {
            if (gifs.get(i).isFavorite() == true) {
                gifsfav.add(gifs.get(i));
            }
        }
        return gifsfav;
    }

    @Override
    public Gifs findName(String name) {
        Gifs search = null;
        for (Gifs gif : gifs) {
            if (gif.getName().equalsIgnoreCase(name)) {
                search = gif;
            }
        }
        return search;

    }
}



