package ie.gmit.open;
// 25/03/2020
// Zdenek Krousky / Paul Lennon
//
// Abstract Subscriber class designed to provide unmodifiable
// functionality to classes inheriting from it. Classes inheriting
// from it, must provide their own version of calculateBill().

public abstract class Subscriber {

    protected Long subscriberId;

    protected String address;

    protected Long phoneNumber;

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract double calculateBill();
}
