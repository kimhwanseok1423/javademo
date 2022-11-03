package java023_jbc.part02;

import java.util.List;



public class DepartmentsController {
public DepartmentsController() {
	
}
public List<DepartmentsDTO> departmentsAllProcess() {
	DepartmentsDAO dao=DepartmentsDAO.getInstance();
	return dao.listDepartments();
	
}
public List<DepartmentsDTO> departmentsSearchProcess(String data){
   DepartmentsDAO dao=DepartmentsDAO.getInstance();
   return dao.searchDepartments(data);
}
}
