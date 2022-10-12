package com.ll.exam.tossapp.product.entity;

import com.ll.exam.tossapp.app.base.entity.BaseEntity;
import com.ll.exam.tossapp.app.member.entity.Member;
import com.ll.exam.tossapp.app.song.entity.Song;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import static javax.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor(access=PROTECTED)
public class Product extends BaseEntity {
    private String subject;
    @ManyToOne
    private Member author;
    @ManyToOne(fetch = LAZY)
    private Song song;
    private int price;
}
