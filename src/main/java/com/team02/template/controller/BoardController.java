package com.team02.template.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.team02.template.dto.BoardDto;
import com.team02.template.dto.PagingDto;
import com.team02.template.dto.SearchDto;
import com.team02.template.dto.Test;
import com.team02.template.service.BoardService;



@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("/test")
	public String test(Model model, Test test) {
		
		System.out.println(test.toString());
		model.addAttribute("title", "testPage");
		
		return "test";
	}
	
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("title", "ksmartBoard");
		
		return "index";
	}
	
	@GetMapping("/boardList")
	public String boardList(Model model, BoardDto bDto, PagingDto pDto, SearchDto sDto ) {
		
		
		Map<String, Object> boardMap = new HashMap<String, Object>();
		
		System.out.println(" 컨트롤러 진입시기 boardDto.toString() : "+bDto.toString() );
		System.out.println(" 컨트롤러 진입시기 PagingDto.toString() : "+pDto.toString() );
		System.out.println(" 컨트롤러 진입시기 searchDto.toString() : "+sDto.toString() );
		boardMap = boardService.getBoardList(bDto, pDto, sDto);
		System.out.println("");
		System.out.println(" 컨트롤러에서 겟보드리스트 후 : "+boardMap.toString());
		model.addAttribute("boardList", boardMap.get("boardList"));
		model.addAttribute("pagingDto", boardMap.get("pagingDto"));
		model.addAttribute("searchDto", boardMap.get("searchDto"));
		model.addAttribute("departList", boardMap.get("departList"));
		model.addAttribute("boardNoticeList", boardMap.get("boardNoticeList"));
		System.out.println(" 컨트롤러에서 겟보드리스트 후 보드리스트 : "+boardMap.get("boardList"));
		System.out.println(" 컨트롤러에서 겟보드리스트 후 페이징dto: "+boardMap.get("pagingDto"));
		System.out.println(" 컨트롤러에서 겟보드리스트 후 서치dto: "+boardMap.get("searchDto"));
		System.out.println(" 컨트롤러에서 겟보드리스트 후 디파트리스트: "+boardMap.get("departList"));
		System.out.println(" 컨트롤러에서 겟보드리스트 후 보드노티스리스트: "+boardMap.get("boardNoticeList"));
		return "board/boardList";
	}
	
	
	@GetMapping("/boardWrite")
	public String boardWrite(Model model) {
		
		model.addAttribute("title", "boardWrite");
		
		return "board/boardWriteForm";
	}
	
	@GetMapping("/boardDetailView")
	public String BoardDetailView(Model model) {
		
		model.addAttribute("title", "boardDetailView");
		
		return "board/boardDetailView";
	}
	
	@GetMapping("/boardUpdateForm")
	public String boardUpdateForm(Model model) {
		
		model.addAttribute("title", "boardUpdateForm");
		
		return "board/boardUpdateForm";
	}
	
	@GetMapping("/boardUpdate")
	public String boardUpdate(Model model) {
		
		model.addAttribute("title", "boardUpdate");
		
		return "index";
	}
	
	@GetMapping("/boardDelete")
	public String boardDelete(Model model) {
		
		model.addAttribute("title", "boardDelete");
		
		return "index";
	}
	
	@GetMapping("/commentWrite")
	public String commentWrite(Model model) {
		
		model.addAttribute("title", "commentWrite");
		
		return "index";
	}
	
	@GetMapping("/commentUpdate")
	public String commentUpdate(Model model) {
		
		model.addAttribute("title", "commentUpdate");
		
		return "index";
	}
	
	@GetMapping("/commentDelete")
	public String commentDelete(Model model) {
		
		model.addAttribute("title", "commentDelete");
		
		return "index";
	}
	
	@GetMapping("/ajaxResponse")
	public String ajaxResponse(Model model) {
		
		model.addAttribute("title", "ajaxResponse");
		
		return "index";
	}
	
	
	
}
