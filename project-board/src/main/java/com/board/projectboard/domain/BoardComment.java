package com.board.projectboard.domain;

import java.time.LocalDateTime;

public class BoardComment {
    private Long id;
    private Board board; // 게시글 (ID)
    private String content; // 본문

    private LocalDateTime createdAt; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정 일시
    private String modifiedBy; // 수정자
}
