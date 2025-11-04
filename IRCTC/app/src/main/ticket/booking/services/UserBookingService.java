package IRCTC.app.src.main.ticket.booking.services;

import IRCTC.app.src.main.ticket.booking.entities.User;

import java.io.File;

public class UserBookingService {
    private User user;

    private static final String USERS_PATH = "../localDb/users.json";

    public User UserBookingService(User user1){

        this.user = user1;

        File users = new File(USERS_PATH);

        return user1;
    }

}
