package com.cpf.patterns.agent;

/**
 * date 2020/7/4
 *
 * @author caopengflying
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public RealImage() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void dispaly() {
        System.out.println("displaying" + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("loading" + fileName);
    }
}
