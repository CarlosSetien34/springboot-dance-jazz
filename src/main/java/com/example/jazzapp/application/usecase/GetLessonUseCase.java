package com.example.jazzapp.application.usecase;

import com.example.jazzapp.application.LessonServiceAdapter;
import com.example.jazzapp.domain.entity.Lesson;
import com.example.jazzapp.domain.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public class GetLessonUseCase implements LessonServiceAdapter {

    @Autowired
    LessonRepository lessonRepository;

    @Override
    public List<Lesson> findAllByUserId(UUID userId) {
        return lessonRepository.findByUserId(userId);
    }

    @Override
    public List<Lesson> findAllByUser_IdAndTags(UUID userId, Set<String> tags) {
        return lessonRepository.findByUser_IdAndTags(userId, tags);
    }
}
