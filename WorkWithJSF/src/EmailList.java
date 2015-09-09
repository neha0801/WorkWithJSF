import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import model.Users;

@ManagedBean
@RequestScoped
public class EmailList {
    private Users user;
    private String message;
    
    public EmailList() {
    }
    
    @PostConstruct
    public void init() {
        user = new Users();
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

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }
}