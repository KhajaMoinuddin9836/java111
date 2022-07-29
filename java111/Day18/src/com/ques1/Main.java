package com.ques1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PlayList pl = new PlayList();

        pl.addSong(new Song("movie1", "song"));
        pl.addSong(new Song("movie2", "song1"));
        pl.addSong(new Song("movie3", "song2"));
        pl.addSong(new Song("movie4", "song3"));

        for(Song s:pl.songs)
        {
            s.play();
        }
    }
}
