package com.zecgwon.webservice.domain.posts;

import com.zecgwon.webservice.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity

// Posts 클래스는 실제 DB의 테이블과 매칭될 클래스이고, Entity 클래스라고 함.
// JPA를 사용하면 DB 데이터에 작업할 경우 실제 쿼리를 날리기 보다는, 이 Entity(Posts) 클래스 수정을 통해 작업합니다.
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
