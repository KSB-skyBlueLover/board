package com.sangbeom.board.board.mapper;

import com.sangbeom.board.board.dto.BoardDto;

import java.util.List;

public interface BoardMapper {
    List<BoardDto> selectBoardList() throws Exception;
}
