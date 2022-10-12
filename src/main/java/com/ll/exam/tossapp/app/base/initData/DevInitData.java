package com.ll.exam.tossapp.app.base.initData;

import com.ll.exam.tossapp.app.member.service.MemberService;
import com.ll.exam.tossapp.app.song.service.SongService;
import com.ll.exam.tossapp.product.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData implements InitDataBefore{
    @Bean
    CommandLineRunner initData(MemberService memberService, SongService songService, ProductService productService) {
        return args -> {
            before(memberService, songService, productService);
        };
    }
}
