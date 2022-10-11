package com.ll.exam.tossapp.app.song.repository;

import com.ll.exam.tossapp.app.song.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
