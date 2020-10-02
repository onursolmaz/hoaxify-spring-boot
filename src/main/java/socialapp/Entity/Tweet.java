package socialapp.Entity;


import lombok.Data;
import org.springframework.lang.Nullable;
import socialapp.File.FileAttachment;

import javax.persistence.*;
<<<<<<< HEAD
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;
=======

import java.util.Date;
import java.util.List;

>>>>>>> d41ad07... developed like system

@Data
@Entity
public class Tweet {

    @Id @GeneratedValue
    private Long id;

    @Column(length = 500)
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne
    private UserEntity userEntity;

<<<<<<< HEAD
    @OneToOne(mappedBy = "tweet")
    private FileAttachment fileAttachment;



=======
    @OneToOne(mappedBy = "tweet",orphanRemoval = true) // orphanRemoval =Tweet siliğinde onla ilgili field da sil
    private FileAttachment fileAttachment;            // orphanRemoval altarnetifi: CascadeType.REMOVE

    @OneToMany(mappedBy = "tweet",cascade = CascadeType.REMOVE)
    private List<Like> likes;
>>>>>>> d41ad07... developed like system
}
