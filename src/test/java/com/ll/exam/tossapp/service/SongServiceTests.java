package com.ll.exam.tossapp.service;

import com.ll.exam.tossapp.app.member.entity.Member;
import com.ll.exam.tossapp.app.member.repository.MemberRepository;
import com.ll.exam.tossapp.app.member.service.MemberService;
import com.ll.exam.tossapp.app.song.entity.Song;
import com.ll.exam.tossapp.app.song.service.SongService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@Transactional
@ActiveProfiles("test")
class SongServiceTests {
    @Autowired
    private SongService songService;

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("음원 업로드")
    void t1() {
        Member author = memberRepository.findByUsername("user1").get();

        Song song = songService.create(author, "제목", "내용");

        assertThat(song).isNotNull();
        assertThat(song.getSubject()).isEqualTo("제목");
        assertThat(song.getContent()).isEqualTo("내용");
    }

    @Test
    @DisplayName("음원 수정")
    void t2() {
        Song song = songService.findById(1).get();
        songService.modify(song, "제목 new", "내용 new");

        assertThat(song).isNotNull();
        assertThat(song.getSubject()).isEqualTo("제목 new");
        assertThat(song.getContent()).isEqualTo("내용 new");
    }

}
