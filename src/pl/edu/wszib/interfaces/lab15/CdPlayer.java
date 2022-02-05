package pl.edu.wszib.interfaces.lab15;

public class CdPlayer extends MusicPlayer{

    public CdPlayer(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("CD odtwarza " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("CD pauza");
    }

    @Override
    public void stop() {
        System.out.println("CD stop");
    }
}
