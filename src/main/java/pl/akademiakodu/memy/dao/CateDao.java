package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Cate;
import pl.akademiakodu.memy.model.Gifs;
import sun.net.www.content.image.gif;

import java.util.ArrayList;
import java.util.List;

import static pl.akademiakodu.memy.dao.GifsDao.gifs;

/**
 * Created by macie on 02.08.2017.
 */
public class CateDao implements ShowCate {
    static List<Cate> cates = new ArrayList<>();

    static {
        Cate animal = new Cate("Zwierze", 1L);
        Cate tank = new Cate("Czołg",2L);
        Cate robot = new Cate("Roboty", 3L);
        cates.add(animal);
        cates.add(tank);
        cates.add(robot);

    }

    @Override
    public List<Cate> showCate() {
        return cates;
    }

    @Override
    public List<Gifs> cateName(Long id) {
        return null;
    }

//    @Override
//    public List<Gifs> cateName(String  categoryName) {
//        List<Gifs> gifses = new ArrayList<>();
//        for (Gifs gif : gifs) {
//            if (gif.getCategoryName().equals(categoryName)) {
//                gifses.add(gif);
//            }
//        }
//        return gifses;

//    }
//    public List<Gifs> cateName(Long id) {
//        List<Gifs> byCate = new ArrayList<>();
//        for (Gifs gif : gifs) {
//            if (gif.getCat().getName().equalsIgnoreCase(categoryName)) {
//                byCate.add(gif);
//            }
//        }
//        return byCate;
//
//    }


}
