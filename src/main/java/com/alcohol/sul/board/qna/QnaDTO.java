package com.alcohol.sul.board.qna;

import java.util.List;

import com.alcohol.sul.board.BoardDTO;

public class QnaDTO extends BoardDTO{
	private Integer ref;
	private Integer step;
	private Integer depth;
	// file
	private List<QnaFileDTO> fileDTOs;
	
	
	public List<QnaFileDTO> getFileDTOs() {
		return fileDTOs;
	}
	public void setFileDTOs(List<QnaFileDTO> fileDTOs) {
		this.fileDTOs = fileDTOs;
	}
	public Integer getRef() {
		return ref;
	}
	public void setRef(Integer ref) {
		this.ref = ref;
	}
	public Integer getStep() {
		return step;
	}
	public void setStep(Integer step) {
		this.step = step;
	}
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(Integer depth) {
		this.depth = depth;
	}
}
