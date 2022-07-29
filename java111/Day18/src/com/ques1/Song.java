package com.ques1;

import java.util.Objects;

public class Song {

    private String movieName;
    private String songName;

    void play(){
        System.out.println(songName+" of "+movieName+" is Playing");
    }

    @Override
    public int hashCode() {

        return Objects.hash(movieName, songName);
    }

    public boolean equals(Object obj) {

        if(this == obj)
        {
            return true;
        }
        if(obj == null)
        {
            return false;
        }
        if(getClass() != obj.getClass())
        {
            return false;

        }

        Song s = (Song) obj;

        return Objects.equals(movieName, s.movieName) && Objects.equals(songName, s.songName);
    }

    public Song(String movieName, String songName) {

        super();
        this.movieName = movieName;
        this.songName = songName;
    }

    @Override
    public String toString() {

        return "Song [movieName="+movieName+", songName="+songName+"]";
    }
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
