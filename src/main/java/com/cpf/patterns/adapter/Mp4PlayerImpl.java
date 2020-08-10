package com.cpf.patterns.adapter;

/**
 * date 2020/6/27
 *
 * @author caopengflying
 */
public class Mp4PlayerImpl implements AdvanceMediaPlayer {

    public void playMp4(String fileName) {
        System.out.println("play Mp4 file.name"+fileName);
    }

    public void playVideo(String fileName) {

    }
}
