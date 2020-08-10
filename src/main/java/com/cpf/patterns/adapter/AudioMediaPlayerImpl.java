package com.cpf.patterns.adapter;

/**
 * date 2020/6/27
 *
 * @author caopengflying
 */
public class AudioMediaPlayerImpl implements AdvanceMediaPlayer {
    public void playMp4(String fileName) {

    }

    public void playVideo(String fileName) {
        System.out.println("playing video file.name" + fileName);
    }
}
