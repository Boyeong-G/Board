package com.example.BoardRecipe.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@ToString
public class BoardDTO {
    private Long id; // 게시글 번호
    private String boardWriter; // 게시글 작성자
    private String boardPass; // 게시글 비밀번호
    private String boardTitle; // 게시글 제목
    private String boardContents; // 게시글 내용
    private int boardHits; // 게시글 조회수
    private String createdAt; // 게시글 작성 시간
    private int fileAttached; // 파일이 첨부 여부 확인
    private List<MultipartFile> boardFile; // 파일 첨부
}
