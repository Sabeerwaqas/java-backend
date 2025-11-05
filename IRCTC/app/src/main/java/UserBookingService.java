package IRCTC.app.src.main.ticket.booking.services;

import IRCTC.app.src.main.ticket.booking.entities.User;

import java.io.File;
import java.lang.reflect.Type;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserBookingService {
    private User user;

    private ObjectMapper objectMapper = new ObjectMapper();

    private static final String USERS_PATH = "../localDb/users.json";

    private List<User> userList;

    public UserBookingService(User user1) throws Exception{

        this.user = user1;

        File users = new File(USERS_PATH);

        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
            @Override
            public Type getType() {
                return super.getType();
            }
        });
    }

}
