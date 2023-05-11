package shishanovrv.vkr.departmentOfSignalling;

import org.springframework.stereotype.Service;
import shishanovrv.vkr.device.Device;
import shishanovrv.vkr.repo.DepartmentRepo;

import java.util.List;

@Service
public class DepartmentOfSignallingService {
    private final DepartmentRepo departmentRepo;
    public DepartmentOfSignallingService(DepartmentRepo departmentRepo){
        this.departmentRepo = departmentRepo;
    }
    public List<DepartmentOfSignalling> getDosList(){ return departmentRepo.findAll();}
    public void add(DepartmentOfSignalling department){ departmentRepo.save(department);}
    public void edit(DepartmentOfSignalling departmentOfSignalling){
        DepartmentOfSignalling updatedDepartment = departmentRepo.getReferenceById(departmentOfSignalling.getId());
        updatedDepartment.copy(departmentOfSignalling);
        departmentRepo.save(updatedDepartment);
    }
    public DepartmentOfSignalling getById(int id){return departmentRepo.getReferenceById(id);}
}
