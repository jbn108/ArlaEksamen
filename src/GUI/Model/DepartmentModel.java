package GUI.Model;

import BE.Department;
import BLL.DepartmentManager;
import javafx.collections.ObservableList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentModel {

    private DepartmentManager departmentManager = new DepartmentManager();
    private static DepartmentModel instance;

    public void exportPhoneNumbers(List<Department> departments) {
        departmentManager.exportPhoneNumbers(departments);
    }

    public void exportPhoneNumbers(Department department) {
        var departments = new ArrayList<Department>();
        departments.add(department);
        departmentManager.exportPhoneNumbers(departments);
    }

    public static DepartmentModel getInstance() {
        return instance == null ? instance = new DepartmentModel() : instance;
    }

    public void deleteDeparment(Department d) {
        departmentManager.deleteDepartment(d);
    }

    public ObservableList<Department> getAllDepartments() {
        return departmentManager.getAllDepartments();
    }
}
