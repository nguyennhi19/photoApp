
package com.codegym.flicker.model.upload;

import com.codegym.flicker.model.Album;
import org.springframework.web.multipart.MultipartFile;

public class AlbumAvatarUpload extends Album {
    private MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
