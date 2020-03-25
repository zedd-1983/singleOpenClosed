package ie.gmit.single;
// 25/03/2020
// Zdenek Krousky / Paul Lennon
// class that creates a user based on JSON string provided
// validation and storage is performed by other classes

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserController {

    //Handles incoming JSON requests that work on User resource/entity

        //Store used by controller
        private UserStorer storeUserService = new UserStorer();

        //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();

            User user = mapper.readValue(userJson, User.class);

            UserValidator myUser = new UserValidator();
            boolean checkedUser = myUser.checkUser(user);

            if(!checkedUser) {
                return "ERROR";
            }

            storeUserService.storeUser(user);

            return "SUCCESS";
        }
 }

