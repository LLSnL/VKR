package shishanovrv.vkr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import shishanovrv.vkr.departmentOfSignalling.DepartmentOfSignalling;

public interface DepartmentRepo extends JpaRepository<DepartmentOfSignalling, Integer> {
}
