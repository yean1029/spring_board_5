package edu.bit.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.board.mapper.BoardMapper;
import edu.bit.board.mapper.EmpMapper;
import edu.bit.board.vo.BoardVO;
import edu.bit.board.vo.EmpVO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EmpServiceImpl implements EmpService{

	private EmpMapper mapper;
	
	@Override
	public List<EmpVO> getList() {
		return mapper.getList();
	}
}
