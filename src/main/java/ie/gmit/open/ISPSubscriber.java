package ie.gmit.open;
// 25/03/2020
// Zdenek Krousky / Paul Lennon
//
// ISPSubscriber class tailored to ISP Subscriber. Uses it's own version
// of calculateBill()

import java.util.List;

public class ISPSubscriber extends Subscriber{

    private int baseRate;

    private long freeUsage;

    public ISPSubscriber() {
    }

    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData*baseRate/100;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    public long getFreeUsage() {
        return freeUsage;
    }

    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }
}