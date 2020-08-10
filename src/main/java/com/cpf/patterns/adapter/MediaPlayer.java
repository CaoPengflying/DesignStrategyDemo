package com.cpf.patterns.adapter;

/**
 * date 2020/6/27
 *
 * @author caopengflying
 */
public interface MediaPlayer {
    /**
     * 播放mp3功能
     * @param type
     * @param fileName
     * @return
     */
     String play(String type, String fileName);
}
