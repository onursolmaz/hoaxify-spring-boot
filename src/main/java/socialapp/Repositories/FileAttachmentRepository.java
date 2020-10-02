package socialapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import socialapp.File.FileAttachment;

=======
import socialapp.Entity.UserEntity;
import socialapp.File.FileAttachment;

import java.io.File;
>>>>>>> d41ad07... developed like system
import java.util.Date;
import java.util.List;


public interface FileAttachmentRepository extends JpaRepository<FileAttachment,Long> {

    List<FileAttachment> findByDateBeforeAndTweetIsNull(Date date); // verdiğimizden tarihden itibaren null olan
                                                                    // dosyaları sil.
<<<<<<< HEAD
=======

    List<FileAttachment> findByTweetUserEntity(UserEntity user);  // user ait olan tweetlerin fileattachment ları
>>>>>>> d41ad07... developed like system
}
