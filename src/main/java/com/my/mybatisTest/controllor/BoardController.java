package com.my.mybatisTest.controllor;

import com.my.mybatisTest.dto.BoardDto;
import com.my.mybatisTest.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @PostMapping("save")
    public String boardSave(BoardDto dto) {
        boardService.save(dto);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<BoardDto> boardDtoList = boardService.findAll();
        model.addAttribute("lists", boardDtoList);
        return "list";
    }

    @GetMapping("/update")
    public String update() {
        return "update";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable("id") Long id, Model model) {
        // 조회 수 증가
        boardService.updateHits(id);

        // 아이디로 검색 후 detail 페이지에 전달
        BoardDto dto = boardService.findById(id);
        model.addAttribute("dto", dto);
        return "detail";
    }

//    @GetMapping("/delete/{id}")
//    public String delete() {
//
//    }
}
