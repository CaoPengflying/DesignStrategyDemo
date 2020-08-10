package com.cpf.patterns.chain;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class AbstractLoggerTest {

    public static void main(String[] args) {
        AbstractLogger abstractLogger = getChain();
        abstractLogger.logMessage(AbstractLogger.INFO, "this is an information");
        abstractLogger.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        abstractLogger.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }

    private static AbstractLogger getChain() {
        AbstractLogger abstractLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        abstractLogger.setNextLogger(consoleLogger);
        return abstractLogger;
    }
}
