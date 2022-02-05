package pl.edu.wszib.interfaces.lab15;

public class Mp3Player extends MusicPlayer{

    public Mp3Player(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("MP3 odtwarza.");
    }

    @Override
    public void pause() {
        System.out.println("MP3 pauza");
    }

    @Override
    public void stop() {
        System.out.println("MP3 stop");
    }
}
