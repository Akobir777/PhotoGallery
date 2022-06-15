package com.example.photogallery.repository;

import com.example.photogallery.entity.Attachment;
import com.example.photogallery.entity.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {

    AttachmentContent findByAttachment(Attachment attachment);

    Optional<AttachmentContent> findByAttachment_Id(Integer id);
}
