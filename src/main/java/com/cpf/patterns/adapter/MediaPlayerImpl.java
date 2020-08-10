package com.cpf.patterns.adapter;

/**
 * date 2020/6/27
 *
 * @author caopengflying
 */
public class MediaPlayerImpl implements MediaPlayer {
    public String play(String type, String fileName) {
        if ("mp3".equals(type)) {
            System.out.println("paly mp3 file.name" + fileName);
        }else {
            MediaAdapter adapter = new MediaAdapter(type);
            adapter.play(type, fileName);
        }
        return null;
    }
}
