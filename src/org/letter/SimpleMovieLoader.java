package org.letter;

import java.util.ArrayList;

public class SimpleMovieLoader implements MovieLoader {

    @Override
    public ArrayList<Movie> getList() throws Exception {

        ArrayList<Movie> movieList = new ArrayList<>();


        movieList.add(new Movie("명량",3456));
        movieList.add(new Movie("공작",1245));
        movieList.add(new Movie("베테랑",37834));
        movieList.add(new Movie("왕의남자",1245));

        return movieList;
    }
}
