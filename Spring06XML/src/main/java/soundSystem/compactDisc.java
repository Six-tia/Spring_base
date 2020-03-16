package soundSystem;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class compactDisc {

    private String artist;
    private int title;
    //private List<String> musics;
    private List<Music> musics;
    private Set<Music> musics1;
    private Map<String, Music> music2;
    private Music[] music3;

    public compactDisc(String artist, int title) {
        this.artist = artist;
        this.title = title;
        System.out.println("Constructor of compactDisc Class with parameters." + this.title + " by " + this.artist);
    }

//    public compactDisc(String artist, int title, List<String> musics) {
//        this.artist = artist;
//        this.title = title;
//        this.musics = musics;
//        System.out.println("Constructor of compactDisc Class with 3 parameters." + this.musics + " by " + this.artist);
//    }


    public compactDisc(String artist, int title, List<Music> musics) {
        this.artist = artist;
        this.title = title;
        this.musics = musics;
        System.out.println("Constructor of compactDisc Class with 3 parameters." + this.musics + " by " + this.artist);
    }

    public compactDisc(String artist, int title, List<Music> musics, Set<Music> musics1) {
        this.artist = artist;
        this.title = title;
        this.musics = musics;
        this.musics1 = musics1;
        System.out.println("Constructor of compactDisc Class with 4 parameters.");
    }

    public compactDisc(String artist, int title, List<Music> musics, Set<Music> musics1, Map<String, Music> music2) {
        this.artist = artist;
        this.title = title;
        this.musics = musics;
        this.musics1 = musics1;
        this.music2 = music2;
        System.out.println("Constructor of compactDisc Class with 5 parameters.");
    }

    public compactDisc(String artist, int title, List<Music> musics, Set<Music> musics1, Map<String, Music> music2, Music[] music3) {
        this.artist = artist;
        this.title = title;
        this.musics = musics;
        this.musics1 = musics1;
        this.music2 = music2;
        this.music3 = music3;
        System.out.println("Constructor of compactDisc Class with 6 parameters.");
    }

    public compactDisc(){
        System.out.println("Constructor of compactDisc Class without parameters." + this.toString());
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        System.out.println("set the value of artist: " + artist + this.toString() );

    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
        System.out.println("set the value of title: " + title + this.toString() );

    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public Set<Music> getMusics1() {
        return musics1;
    }

    public void setMusics1(Set<Music> musics1) {
        this.musics1 = musics1;
    }

    public Map<String, Music> getMusic2() {
        return music2;
    }

    public void setMusic2(Map<String, Music> music2) {
        this.music2 = music2;
    }

    public Music[] getMusic3() {
        return music3;
    }

    public void setMusic3(Music[] music3) {
        this.music3 = music3;
        for(Music music:music3){
            System.out.println("set the value of music: " + music.getPop() + music.getDuration());
        }
    }

    public void play(){
        System.out.println("the player is working...");
//        for(Music music:musics){
//            System.out.println("music: " + music.getPop() + music.getType());
//        }
//        for(String key : music2.keySet()){
//            System.out.println("key is : " + key);
//            Music music = music2.get(key);
//            System.out.println("music: " + music.getPop() + music.getType());
//        }
        for(Music music:music3){
            System.out.println("music: " + music.getPop() + music.getDuration());
        }
    }

}
