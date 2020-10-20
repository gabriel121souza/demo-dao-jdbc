package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
public static void main(String[] args) {
	DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
	Department dep = new Department();
	
/*	dep.setName("Cinemas");
	departmentDao.insert(dep);
	System.out.println("inserted department");
	*/
	dep.setId(5);
	dep.setName("House");
	departmentDao.update(dep);
	
}
}
