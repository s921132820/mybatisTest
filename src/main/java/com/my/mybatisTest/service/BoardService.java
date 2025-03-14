package com.my.mybatisTest.service;

import com.my.mybatisTest.dto.BoardDto;
import com.my.mybatisTest.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public void save(BoardDto dto) {
        //boardMapper 에 DTO 전달해서 저장
        boardMapper.save(dto);
    }

    public List<BoardDto> findAll() {
        return boardMapper.findAll();
    }

    public void updateHits(Long id) {
        boardMapper.updateHits(id);
    }

    public BoardDto findById(Long id) {
        return boardMapper.findById(id);
    }
}
