
package com.codegym.flicker.service;

import com.codegym.flicker.model.Album;
import com.codegym.flicker.model.Image;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IImageService {

    Iterable<Image> findAll();

    Page<Image> findAll(Pageable pageable);

    Image findById(Long id);

    void save(Image image);

    void remove(Long id);

    Iterable<Image> findAllByAlbum(Album album);

    Iterable<Image> findAllByAlbumAndDelete(Long albumId);

    Iterable<Image> findAllByDeleteAndAlbumDelete();

    Page<Image> findAllByDeleteAndAlbumDelete(Pageable pageable);

}
