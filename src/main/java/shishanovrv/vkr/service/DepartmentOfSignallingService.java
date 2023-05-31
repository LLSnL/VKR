package shishanovrv.vkr.service;

import org.springframework.stereotype.Service;
import shishanovrv.vkr.model.DepartmentOfSignalling;
import shishanovrv.vkr.model.Device;
import shishanovrv.vkr.repo.DepartmentRepo;
import java.util.List;

@Service
public class DepartmentOfSignallingService {
    private final DepartmentRepo departmentRepo;

    public DepartmentOfSignallingService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public List<DepartmentOfSignalling> getDosList() {
        return departmentRepo.findAll();
    }

    public void add(String name) {
        DepartmentOfSignalling a = new DepartmentOfSignalling();
        a.setName(name);
        departmentRepo.save(a);
    }

    public void edit(int id, String name) {
        DepartmentOfSignalling a = departmentRepo.getReferenceById(id);
        a.setName(name);
        departmentRepo.save(a);
    }

    public DepartmentOfSignalling getById(int id) {
        return departmentRepo.getReferenceById(id);
    }

    public void delete(int id) {
        departmentRepo.deleteById(id);
    }

    public void addToList(Device device, int id) {
        DepartmentOfSignalling updatedDepartment = departmentRepo.getReferenceById(id);
        updatedDepartment.addToList(device);
        departmentRepo.save(updatedDepartment);
    }

    public void removeFromList(int DepartmentId, Device device){
        DepartmentOfSignalling updatedDepartment = departmentRepo.getReferenceById(DepartmentId);
        updatedDepartment.removeFromList(device);
        departmentRepo.save(updatedDepartment);
    }
}
