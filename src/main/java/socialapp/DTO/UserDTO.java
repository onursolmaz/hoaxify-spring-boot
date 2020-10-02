package socialapp.DTO;

import lombok.Getter;
import lombok.Setter;
<<<<<<< HEAD
import socialapp.Entity.UserEntity;

=======
import socialapp.Entity.Like;
import socialapp.Entity.UserEntity;

import java.util.List;

>>>>>>> d41ad07... developed like system
@Getter
@Setter
public class UserDTO {

    private String username;
    private String displayName;
    private String image;

<<<<<<< HEAD
    public UserDTO(UserEntity user){
=======
    public UserDTO(UserEntity user) {
>>>>>>> d41ad07... developed like system
        this.setUsername(user.getUsername());
        this.setDisplayName(user.getDisplayName());
        this.setImage(user.getImage());

    }

<<<<<<< HEAD
    public UserDTO() {

    }
=======
>>>>>>> d41ad07... developed like system
}
