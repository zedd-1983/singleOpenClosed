package ie.gmit.open;
// 25/03/2020
// Zdenek Krousky / Paul Lennon
//
// PhoneSubscriber class tailored to Phone subscriber. Uses its
// own version of calculateBill() specific to phone subscriber.

import java.util.List;

public class PhoneSubscriber extends Subscriber{

    private int baseRate;

    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }
}