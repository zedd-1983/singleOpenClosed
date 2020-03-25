package ie.gmit.single;
// 25/03/2020
// Zdenek Krousky / Paul Lennon
//
// Class responsible for storing user to permanent storage.

public class UserStorer {

    private Store store = new Store();

    public void storeUser(User user)
    {
        store.store(user);
    }
}
