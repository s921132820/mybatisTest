package com.my.mybatisTest.mapper;

import com.my.mybatisTest.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
    void   save(@Param("boardDto") BoardDto dto);

    List<BoardDto> findAll();

    void updateHits(Long id);

    BoardDto findById(@Param("id") Long id);

    void deleteById(Long id);

    void updateById(@Param("boardDto") BoardDto dto);

    List<BoardDto> searchList(@Param("category") String category, @Param("keyword") String keyword);
}
