package com.emp.model;
import java.sql.Date;

public class EmpVO implements java.io.Serializable{
	private Integer empno;
	private String ename;
	private String job;
	private Date hiredate;
	private Double sal;
	private Double comm;
	private Integer deptno;
	//要先在oracle新增Emp2表格中的BLOB欄位
	private byte[] MY_PHOTO;
	//加入vo照片
	public byte[] getMY_PHOTO() {
		return MY_PHOTO;
	} 
	
	public void setMY_PHOTO(byte[] MY_PHOTO) {
		this.MY_PHOTO=MY_PHOTO;
	}
	//利用get set儲存
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
}
