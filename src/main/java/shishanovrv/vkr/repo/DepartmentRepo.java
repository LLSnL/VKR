package shishanovrv.vkr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import shishanovrv.vkr.model.DepartmentOfSignalling;

public interface DepartmentRepo extends JpaRepository<DepartmentOfSignalling, Integer> {
}
