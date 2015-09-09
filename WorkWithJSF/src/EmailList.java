import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import model.User1;

@ManagedBean
@RequestScoped
public class EmailList {
    private User1 user;
    private String message;
    
    public EmailList() {
    }
    
    @PostConstruct
    public void init() {
        user = new User1();
    }
    
    public String addToEmailList() {
        if (UserDB.emailExists(user.getEmail())) {
            message = "This email address already exists. " +
                    "Please enter another email address";
            System.out.println(message);
            return "index";
        } else {
            UserDB.insert(user);
            return "thanks";
        }
    }

    public User1 getUser() {
        return user;
    }

    public void setUser(User1 user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }
}