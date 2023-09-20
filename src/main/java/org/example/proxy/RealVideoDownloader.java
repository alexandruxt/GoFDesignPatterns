package org.example.proxy;

public class RealVideoDownloader implements VideoDownloader{
    @Override
    public Video getVideo(String videoName) {
        System.out.println("Downloading video");
        return new Video(videoName);
    }
}
