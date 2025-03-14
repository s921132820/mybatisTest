package com.my.mybatisTest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@ToString
public class BoardDto {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private  int boardHits;
    private String createdAt;
    // 파일첨부용
    private int fileAttached; // 첨부 있으면 =1, 없으면 = 0
    private List<MultipartFile> boardFile;
}
