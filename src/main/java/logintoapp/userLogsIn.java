package logintoapp;

public class userLogsIn {


    private String currentUsername;
    private String currentPassword;
    private String message;
    private boolean isLoggedOn;


    public void SetUserInDataBase(String username, String password) {
        this.currentUsername = username;
        this.currentPassword = password;

    }

    public void logIn(String username, String password) {
        if (username.equals(currentUsername) && password.equals(currentPassword)) {
            this.message = "user is logged in";
            this.isLoggedOn = true;
        } else {
            this.message = "user is not logged in";
            this.isLoggedOn = false;
        }

    }

    public String getMessage() {

        return message;
    }

    public boolean isLoggedOn() {

        return isLoggedOn;
    }
    public String getCurrentUsername(){
        return currentUsername;
    }

    public String getCurrentPassword(){
        return currentPassword;
    }

}
