package socialapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import socialapp.DTO.TweetSubmitDTO;
<<<<<<< HEAD
=======
import socialapp.Entity.Like;
>>>>>>> d41ad07... developed like system
import socialapp.Entity.Tweet;
import socialapp.Entity.UserEntity;
import socialapp.File.FileAttachment;
import socialapp.Repositories.FileAttachmentRepository;
<<<<<<< HEAD
=======
import socialapp.Repositories.LikeRepository;
>>>>>>> d41ad07... developed like system
import socialapp.Repositories.TweetRepository;
import socialapp.Repositories.UserRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TweetService {

    @Autowired
<<<<<<< HEAD
    private TweetRepository TweetRepository;
=======
    private TweetRepository tweetRepository;
>>>>>>> d41ad07... developed like system
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FileAttachmentRepository fileAttachmentRepository;
<<<<<<< HEAD
=======
    @Autowired
    private FileService fileService;
    @Autowired
    private LikeRepository likeRepository;
>>>>>>> d41ad07... developed like system

    public void save(TweetSubmitDTO tweetSubmitDTO, UserEntity user) {
        Tweet tweet = new Tweet();
        tweet.setContent(tweetSubmitDTO.getContent());
        tweet.setDate(new Date());
        tweet.setUserEntity(user);
<<<<<<< HEAD
        TweetRepository.save(tweet);
=======
        tweetRepository.save(tweet);
>>>>>>> d41ad07... developed like system
        Optional<FileAttachment> optionalFileAttachment = fileAttachmentRepository.findById(tweetSubmitDTO.getAttachmentId());
        if (optionalFileAttachment.isPresent()) {
            FileAttachment fileAttachment = optionalFileAttachment.get();
            fileAttachment.setTweet(tweet);
            fileAttachmentRepository.save(fileAttachment);
        }
    }

    public Page<Tweet> getTweets(Pageable page) {
<<<<<<< HEAD

        return TweetRepository.findAll(page);
=======
        return tweetRepository.findAll(page);
>>>>>>> d41ad07... developed like system
    }

    public Page<Tweet> getUserTweets(String username, Pageable page) {
        UserEntity indDB = userRepository.findByUsername(username);
<<<<<<< HEAD
        return TweetRepository.findByUserEntity(indDB, page);
=======
        return tweetRepository.findByUserEntity(indDB, page);
>>>>>>> d41ad07... developed like system
    }

    public Page<Tweet> getOldTweets(Long id, String username, Pageable page) {
        Specification<Tweet> specification = idLessThan(id);
        if (username != null) {
            UserEntity inDB = userRepository.findByUsername(username);
            specification = specification.and(userIs(inDB));
        }
<<<<<<< HEAD
        return TweetRepository.findAll(specification, page);
=======
        return tweetRepository.findAll(specification, page);
>>>>>>> d41ad07... developed like system
    }


    public Long getNewTweetsCount(Long id, String username) {
        Specification<Tweet> specification = idGreaterThan(id);
        if (username != null) {
            UserEntity inDB = userRepository.findByUsername(username);
            specification = specification.and(userIs(inDB));
        }

<<<<<<< HEAD
        return TweetRepository.count(specification);
=======
        return tweetRepository.count(specification);
>>>>>>> d41ad07... developed like system
    }

    public List<Tweet> getNewTweets(Long id, String username, Sort sort) {
        Specification<Tweet> specification = idGreaterThan(id);
        if (username != null) {
            UserEntity inDB = userRepository.findByUsername(username);
            specification = specification.and(userIs(inDB));
        }

<<<<<<< HEAD
        return TweetRepository.findAll(specification, sort);
=======
        return tweetRepository.findAll(specification, sort);
>>>>>>> d41ad07... developed like system
    }

    Specification<Tweet> idLessThan(Long id) {
        return (root, query, criteriaBuilder) -> {
            return criteriaBuilder.lessThan(root.get("id"), id);
        };
    }

    Specification<Tweet> userIs(UserEntity user) {
        return (root, query, criteriaBuilder) -> {
            return criteriaBuilder.equal(root.get("userEntity"), user);
        };
    }

    Specification<Tweet> idGreaterThan(Long id) {
        return (root, query, criteriaBuilder) -> {
            return criteriaBuilder.greaterThan(root.get("id"), id);
        };
    }

<<<<<<< HEAD
=======
    public Boolean delete(Long id, UserEntity loggedInUser) {
        Tweet tweetInDB=tweetRepository.getOne(id); // findById den farkı Optinal dönmüyor
        if (tweetInDB==null)
            return false;
        if (tweetInDB.getUserEntity().getId() != loggedInUser.getId())
            return false;
        if(tweetInDB.getFileAttachment()!=null){
            String fileName=tweetInDB.getFileAttachment().getName();
            fileService.deleteAttachmentFile(fileName);
        }
        tweetRepository.deleteById(id);
        return true;
    }

    public void like(Long tweetId, UserEntity user) {
        Like like=new Like();
        like.setTweet(tweetRepository.getOne(tweetId));
        like.setUser(user);
        likeRepository.save(like);
    }

    public void deleteLike(Long tweetId, UserEntity loggedInUser) {
        Like inDB=likeRepository.findByTweetIdAndUser(tweetId,loggedInUser);
        likeRepository.delete(inDB);

    }

//    public void deleteOfUserTweets(UserEntity inDB) {
////        Specification<Tweet> specification = userIs(inDB);
////        List<Tweet>tweetList=tweetRepository.findAll(specification);
//        tweetRepository.deleteAll(tweetRepository.findByUserEntity(inDB));
//    }

>>>>>>> d41ad07... developed like system

    // *** Aşağıdaki fonskiyonlar controllerda iyileştirme yapmadan önce kullanılıyordu ***

//    public Long getNewTweetsCountOfUser(Long id, String username) {
//        UserEntity inDB = userRepository.findByUsername(username);
//        return repository.countByIdGreaterThanAndUserEntity(id, inDB);
//
//    }
//
//    public Page<Tweet> getUserOldTweets(Long id, String username, Pageable page) {
//        UserEntity inDB = userRepository.findByUsername(username);
//        return repository.findByIdLessThanAndUserEntity(id, inDB, page);
//    }
//    public List<Tweet> getNewTweetsOfUser(Long id, String username, Sort sort) {
//        UserEntity inDB = userRepository.findByUsername(username);
//        return repository.findByIdGreaterThanAndUserEntity(id, inDB, sort);
//    }
}
