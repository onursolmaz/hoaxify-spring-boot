package socialapp.DTO;

import lombok.Data;
<<<<<<< HEAD
import socialapp.Entity.Tweet;
import socialapp.File.FileAttachment;
=======
import socialapp.Entity.Like;
import socialapp.Entity.Tweet;
import socialapp.Entity.UserEntity;

import java.util.List;
>>>>>>> d41ad07... developed like system

@Data
public class TweetDTO {

    private Long id;
    public String content;
    private Long date;
    private UserDTO user;
    private FileAttacmentDTO fileAttachment;

<<<<<<< HEAD

    public TweetDTO(Tweet tweet){
=======
    // react tarafı için önemli olan 2 bilgi.. birincisi kaç like olduğu
    private long likeCount;
    // ikincisi, şu an login olan kullanıcı bu hoax u like etti mi etmedi mi?
    private boolean iLiked = false;
//
//
//    public TweetDTO(Tweet tweet){
//        this.setId(tweet.getId());
//        this.setContent(tweet.getContent());
//        this.setDate(tweet.getDate().getTime());
//        this.setUser(new UserDTO(tweet.getUserEntity()));
//        this.setLikeCount(tweet.getLikes().size());
//        if(tweet.getFileAttachment()!=null){
//            this.fileAttachment=new FileAttacmentDTO(tweet.getFileAttachment());
//        }
//
//
//    }

    public TweetDTO(Tweet tweet, UserEntity loggedInUser){
>>>>>>> d41ad07... developed like system
        this.setId(tweet.getId());
        this.setContent(tweet.getContent());
        this.setDate(tweet.getDate().getTime());
        this.setUser(new UserDTO(tweet.getUserEntity()));
<<<<<<< HEAD
        if(tweet.getFileAttachment()!=null){
            this.fileAttachment=new FileAttacmentDTO(tweet.getFileAttachment());
        }
=======
        this.setLikeCount(tweet.getLikes().size());

        if(tweet.getFileAttachment()!=null){
            this.fileAttachment=new FileAttacmentDTO(tweet.getFileAttachment());
        }
        if(loggedInUser!=null){
            boolean loggedInUserLikedThisHoax = tweet.getLikes().stream().filter(currentLike -> currentLike.getUser().getUsername().equals(loggedInUser.getUsername())).findAny().isPresent();
            this.setILiked(loggedInUserLikedThisHoax);
        }
>>>>>>> d41ad07... developed like system


    }


}
