package socialapp.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import socialapp.Services.FileService;

@RestController
public class FileController {

    @Autowired
    FileService fileService;

    @PostMapping("/api/tweet-attachments")
<<<<<<< HEAD
   FileAttachment saveTweetAttachment(MultipartFile file) {
=======
    FileAttachment saveTweetAttachment(MultipartFile file) {
>>>>>>> d41ad07... developed like system
        return fileService.saveTweetAttachment(file);
    }
}
