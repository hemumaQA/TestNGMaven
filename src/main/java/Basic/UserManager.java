package Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class UserManager {
    ArrayList<String> usermanager=new  ArrayList<String>(Arrays.asList("abc@gamil.com","xyz@gmail.com","hemuma85@gmail.com"));
    public void addUser(String userEmail) throws DuplicateUserException{
       for(String s:usermanager) {
          if(s.equals(userEmail)){
              throw new DuplicateUserException("User already exists");
          }
       }


    }
}
