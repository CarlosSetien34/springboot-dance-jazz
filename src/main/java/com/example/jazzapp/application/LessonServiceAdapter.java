package com.example.jazzapp.application;

import com.example.jazzapp.domain.entity.Lesson;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface LessonServiceAdapter {

    List<Lesson> findAllByUserId(UUID userId);

    List<Lesson> findAllByUser_IdAndTags(UUID userId, Set<String> tag);


}
