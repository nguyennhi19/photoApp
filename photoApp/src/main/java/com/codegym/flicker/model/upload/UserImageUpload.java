
package com.codegym.flicker.model.upload;

import com.codegym.flicker.model.User;
import org.springframework.web.multipart.MultipartFile;

public class UserImageUpload extends User {
    private MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
