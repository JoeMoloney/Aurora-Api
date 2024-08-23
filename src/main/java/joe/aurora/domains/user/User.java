package joe.aurora.domains.user;

import lombok.Data;

@Data
public class User {
    public Long userId;
    public String fName;
    public String lName;

    public String getUserAsString() {
        return String.format("UserId: %s, FirstName: %s, LastName: %s", this.userId, this.fName, this.lName);
    }

    public String getFullName() {
        return String.format("%s %s", this.fName, this.lName);
    }
}
