package shishanovrv.vkr.departmentOfSignalling;

import org.springframework.stereotype.Service;
import shishanovrv.vkr.repo.DepartmentRepo;

@Service
public class DepartmentOfSignallingService {
    private final DepartmentRepo departmentRepo;
    public DepartmentOfSignallingService(DepartmentRepo departmentRepo){
        this.departmentRepo = departmentRepo;
    }


}
