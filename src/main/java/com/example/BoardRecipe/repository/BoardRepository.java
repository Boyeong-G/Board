package com.example.BoardRecipe.repository;

import com.example.BoardRecipe.dto.BoardDTO;
import com.example.BoardRecipe.dto.BoardFileDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    private final SqlSessionTemplate sql;

    public BoardDTO save(BoardDTO boardDTO) {
        sql.insert("Board.save", boardDTO); // 하나의 파라미터만 넘길 수 있음 // 두 개 이상의 파라미터를 넘기려면 hash 등을 사용!!
        // Board: <mapper namespace="Board">의 namespace 값을 의미
        // save: <insert id="save" parameterType="board">의 id 값을 의미
        return boardDTO;
    }

    public List<BoardDTO> findAll() {
        return sql.selectList("Board.findAll");
    }

    public void updateHits(Long id) {
        sql.update("Board.updateHits", id);
    }

    public BoardDTO findById(Long id) {
        return sql.selectOne("Board.findById", id);
    }

    public void update(BoardDTO boardDTO) {
        sql.update("Board.update", boardDTO);
    }

    public void delete(Long id) {
        sql.delete("Board.delete", id);
    }

    public void saveFile(BoardFileDTO boardFileDTO) {
        sql.insert("Board.saveFile", boardFileDTO);
    }

    public List<BoardFileDTO> findFile(Long id) {
        return sql.selectList("Board.findFile", id);
    }
}
