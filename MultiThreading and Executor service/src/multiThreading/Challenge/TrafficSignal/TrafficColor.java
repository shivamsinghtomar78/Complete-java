package multiThreading.Challenge.TrafficSignal;

public enum TrafficColor {
    RED(9000),YELLOW(1000),GREEN(3000);
    private int onTimingMillis;

    TrafficColor(int onTimingMillis) {
        this.onTimingMillis = onTimingMillis;
    }

    public int getOnTimingMillis() {
        return onTimingMillis;
    }
}
