package com.sangbeom.board.board.service;

import com.sangbeom.board.board.dto.BoardDto;

import java.util.List;

public interface BoardService {
    public List<BoardDto> selectBoardList() throws Exception;
}
