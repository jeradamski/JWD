package pl.edu.wszib.interfaces.lab15;

public class MusicApp {

    public static void main(String[] args) {

        Song[] library = new Song[3];
        library[0] = new Song("Michael Jackson","Beat It","Thriller");
        library[1] = new Song("Pearl Jam","Even Flow","Ten");
        library[2] = new Song("Portishead","Over","NYC Live");

        Player[] players = {new Mp3Player(library), new CdPlayer(library) };

        players[0].play();
        players[0].stop();
        players[0].nextSong();
        players[0].pause();

        System.out.println();

        players[1].play();
        players[1].pause();
        players[1].nextSong();
        players[1].previousSong();
    }
}
