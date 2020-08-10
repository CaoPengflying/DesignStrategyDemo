package com.cpf.patterns.adapter;

/**
 * date 2020/6/27
 *
 * @author caopengflying
 */
public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    public String play(String type, String fileName) {
        if ("mp4".equals(type)) {
            advanceMediaPlayer.playMp4(fileName);
        } else {
            advanceMediaPlayer.playVideo(fileName);
        }
        return null;
    }

    public MediaAdapter(String autoType) {
        if ("mp4".equals(autoType)) {
            advanceMediaPlayer = new Mp4PlayerImpl();
        } else if ("video".equals(autoType)) {
            advanceMediaPlayer = new AudioMediaPlayerImpl();
        }
    }

}
