package util;

import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import model.Song;

/**
 * Created by makhamwan on 5/16/2017 AD.
 */

public class Storage {
    private static Storage instance;
    private ArrayList<Song> listSong = new ArrayList<Song>();
    private ArrayList<Song> favSong = new ArrayList<Song>();

    private Storage(){
        songProvider();
    }

    public static Storage getInstances(){
        if (instance == null) instance = new Storage();
        return instance;
    }

    public void songProvider(){
        Song part_of_your_world = new Song("part of your world", "", "" , "",
                "What would I give\n" +
                "To live where you are?\n" +
                "What would I pay\n" +
                "To stay here beside you?\n" +
                "What would I do to see you\n" +
                "Smiling at me?\n" +
                "\n" +
                "Where would we walk?\n" +
                "Where would we run?\n" +
                "If we could stay all day in the sun?\n" +
                "Just you and me\n" +
                "And I could be\n" +
                "Part of your world\n" +
                "\n" +
                "I don't know when\n" +
                "I don't know how\n" +
                "But I know something's starting right now\n" +
                "Watch and you'll see\n" +
                "Some day I'll be\n" +
                "Part of your world");

        Song daughter_of_triton = new Song("daughter of triton", "", "", "",
                "Ah, we are the daughters of Triton\n" +
                "Great father who loves us and named us well\n" +
                "Aquata, Andrina, Arista, Atina, Adella, Allana\n" +
                "And then there is the youngest in her musical debut\n" +
                "Our seventh little sister, we're presenting her to you\n" +
                "To sing a song Sebastian wrote, her voice is like a bell\n" +
                "She's our sister, Ariel");

        listSong.add(part_of_your_world);
        listSong.add(daughter_of_triton);
        favSong.add(part_of_your_world);
    }

    // add new song
    public void addListSong(String title, String artist, String album, String url, String lyric){listSong.add(new Song(title,artist,album,url,lyric));}
    // add existing song
    public void addFavSong(Song song){favSong.add(song);}

    public List<Song> getListSong(){return listSong;}
    public List<Song> getFavSong(){return favSong;}
}
