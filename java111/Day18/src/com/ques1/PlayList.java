package com.ques1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class PlayList {

    public List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {

        LinkedHashSet<Song> song1 = new LinkedHashSet<>(songs);

        if(song1.contains(song)!=true)
        {
            songs.add(song);

            System.out.println("Song is added to your playlist successfully");

        }
        else
        {
            System.out.println("Song is already in your playlist");
        }
    }

}
