package com.cpf.patterns.agent;

/**
 * date 2020/7/4
 *
 * @author caopengflying
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void dispaly() {
        if (null == realImage) {
            realImage = new RealImage(fileName);
        }
        realImage.dispaly();
    }
}
