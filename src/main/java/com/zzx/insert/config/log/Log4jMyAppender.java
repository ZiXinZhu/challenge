package com.zzx.insert.config.log;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Priority;

public class Log4jMyAppender extends DailyRollingFileAppender {
    @Override
    public boolean isAsSevereAsThreshold(Priority priority) {
        return this.getThreshold().equals(priority);
    }
}
