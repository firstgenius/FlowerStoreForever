package users;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Receiver implements User{
    public int id;

    @Override
    public String update(String status){
        return "Status: " + status;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

}
