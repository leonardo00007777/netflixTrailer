package com.x62life.mo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.x62life.mo.dao.BoardDao;
import com.x62life.mo.model.Board;
import com.x62life.mo.model.BoardReply;
import com.x62life.mo.service.BoardService;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Resource(name="boardDao")
	private BoardDao boardDao;

	@Override
	public int regContent(Map<String, Object> paramMap) {
		//????? ?????? ???
		if(paramMap.get("id")==null) {
			return boardDao.regContent(paramMap);
		}else {//????? ?????? ????
			return boardDao.modifyContent(paramMap);
		}
	}

	@Override
	public int getContentCnt(Map<String, Object> paramMap) {
		return boardDao.getContentCnt(paramMap);
	}

	@Override
	public List<Board> getContentList(Map<String, Object> paramMap) {
		return boardDao.getContentList(paramMap);
	}

//	@Override
//	public List<Board> getTestList(Map<String, Object> paramMap) {
//		return boardDao.getTestList(paramMap);
//	}

	@Override
	public Board getContentView(Map<String, Object> paramMap) {
		return boardDao.getContentView(paramMap);
	}

	@Override
	public int regReply(Map<String, Object> paramMap) {
		return boardDao.regReply(paramMap);
	}

	@Override
	public List<BoardReply> getReplyList(Map<String, Object> paramMap) {

		List<BoardReply> boardReplyList = boardDao.getReplyList(paramMap);

		//msyql ???? ?????? ?????? ?????? ???? ??? ???????

		//?еш?
		List<BoardReply> boardReplyListParent = new ArrayList<BoardReply>();
		//???
		List<BoardReply> boardReplyListChild = new ArrayList<BoardReply>();
		//????
		List<BoardReply> newBoardReplyList = new ArrayList<BoardReply>();

		//1.?еш?? ??? ?м┌?
		for(BoardReply boardReply: boardReplyList){
			if(boardReply.getDepth().equals("0")){
				boardReplyListParent.add(boardReply);
			}else{
				boardReplyListChild.add(boardReply);
			}
		}

		//2.?еш? ??????.
		for(BoardReply boardReplyParent: boardReplyListParent){
			//2-1. ?еш?? ?????? ??ве?.
			newBoardReplyList.add(boardReplyParent);
			//3.????? ??????.
			for(BoardReply boardReplyChild: boardReplyListChild){
				//3-1. ?еш??? ????? ??? ??ве?.
				if(boardReplyParent.getreplyId().equals(boardReplyChild.getparentId())){
					newBoardReplyList.add(boardReplyChild);
				}

			}

		}

		//?????? list return
		return newBoardReplyList;
	}

	@Override
	public int delReply(Map<String, Object> paramMap) {
		return boardDao.delReply(paramMap);
	}

	@Override
	public int getBoardCheck(Map<String, Object> paramMap) {
		return boardDao.getBoardCheck(paramMap);
	}

	@Override
	public int delBoard(Map<String, Object> paramMap) {
		return boardDao.delBoard(paramMap);
	}

	@Override
	public boolean checkReply(Map<String, Object> paramMap) {
		return boardDao.checkReply(paramMap);
	}

	@Override
	public boolean updateReply(Map<String, Object> paramMap) {
		return boardDao.updateReply(paramMap);
	}

}
