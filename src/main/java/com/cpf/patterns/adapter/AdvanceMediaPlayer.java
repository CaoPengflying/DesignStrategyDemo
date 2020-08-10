package com.cpf.patterns.adapter;

/**
 * date 2020/6/27
 *
 * @author caopengflying
 */
public interface AdvanceMediaPlayer {
    /**
     * 播放Mp4
     * @param fileName
     */
    void playMp4(String fileName);

    /**
     * 播放视频
     * @param fileName
     */
    void playVideo(String fileName);
}
