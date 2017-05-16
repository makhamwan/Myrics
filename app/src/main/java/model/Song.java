package model;

/**
 * Created by makhamwan on 5/16/2017 AD.
 */

public class Song {
    private String title;
    private String artist;
    private String album;
    private String url;
    private String lyric;

    public Song(String title, String artist, String album, String url, String lyric){
        this.title = title;
        this.lyric = lyric;
        if (title.length() == 0 ) {this.title = "unknown";}
        if (artist.length() == 0 ) {this.artist = "unknown";}
        if (album.length() == 0 ) {this.album = "unknown";}
    }

    public String getTitle() {return this.title;}
    public void setTitle(String title) {this.title = title;}

    public String getArtist() {return this.artist;}
    public void setArtist(String artist) {this.artist = artist;}

    public String getAlbum() {return this.album;}
    public void setAlbum(String album) {this.album = album;}

    public String getUrl() {return this.url;}
    public void setUrl(String url) {this.url = url;}

    public String getLyric() {return this.lyric;}
    public void setLyric(String lyric) {this.lyric = lyric;}
}