package com.cpf.patterns.chain;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int ERROR = 2;
    public static final int DEBUG = 3;
    protected int level;

    /**
     * 责任链中的下一个元素
     */
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
