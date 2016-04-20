package app.Utilities;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * Created by Marcel on 4/19/2016.
 */

public class Timer {
    private long eatingTime;
    private long thinkingTime;
    private long hungryTime;
    private DoubleProperty averageEatingTime;
    private DoubleProperty averageThinkingTime;
    private DoubleProperty averageHungryTime;
    private long eatingCounter;
    private long thinkingCounter;
    private long hungryCounter;

    public void addEatingTime(long time) {
        this.eatingTime += time;
    }

    public void addThinkingTime(long time) {
        this.thinkingTime += time;
    }

    public void addHungryTime(long time) {
        this.hungryTime += time;
    }

    public long getEatingTime() {
        return eatingTime;
    }

    public void setEatingTime(long eatingTime) {
        this.eatingTime = eatingTime;
    }

    public long getThinkingTime() {
        return thinkingTime;
    }

    public void setThinkingTime(long thinkingTime) {
        this.thinkingTime = thinkingTime;
    }

    public long getHungryTime() {
        return hungryTime;
    }

    public void setHungryTime(long hungryTime) {
        this.hungryTime = hungryTime;
    }

    public long getEatingCounter() {
        return eatingCounter;
    }

    public void setEatingCounter(long eatingCounter) {
        this.eatingCounter = eatingCounter;
    }

    public long getThinkingCounter() {
        return thinkingCounter;
    }

    public void setThinkingCounter(long thinkingCounter) {
        this.thinkingCounter = thinkingCounter;
    }

    public long getHungryCounter() {
        return hungryCounter;
    }

    public void setHungryCounter(long hungryCounter) {
        this.hungryCounter = hungryCounter;
    }

    public DoubleProperty averageThinkingTimeProperty() {
        if (averageThinkingTime == null) {
            averageThinkingTime = new SimpleDoubleProperty(this, "averageThinkingTime");
        }

        return averageThinkingTime;
    }

    public void setAverageEatingTime(Double averageEatingTime) {
        averageEatingTimeProperty().setValue(averageEatingTime);
    }

    public DoubleProperty averageEatingTimeProperty() {
        if (averageEatingTime == null) {
            averageEatingTime = new SimpleDoubleProperty(this, "averageEatingTime");
        }

        return averageEatingTime;
    }

    public void setAverageThinkingTime(Double averageThinkingTime) {
        averageThinkingTimeProperty().setValue(averageThinkingTime);
    }

    public DoubleProperty averageHungryTimeProperty() {
        if (averageHungryTime == null) {
            averageHungryTime = new SimpleDoubleProperty(this, "averageHungryTime");
        }

        return averageHungryTime;
    }

    public void setAverageHungryTime(Double averageHungryTime) {
        averageHungryTimeProperty().setValue(averageHungryTime);
    }
}
