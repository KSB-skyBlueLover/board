package com.sangbeom.board.board.mapper;

import com.sangbeom.board.board.dto.BoardDto;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDto> selectBoardList() throws Exception;
}
