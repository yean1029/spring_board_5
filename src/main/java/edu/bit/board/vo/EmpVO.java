package edu.bit.board.vo;

import lombok.Data;

@Data
public class EmpVO {
	int empno;
	String ename;
	String job;
	int mgr;
	String hiredate;
	int sal;
	int comm;
	int deptno;
}