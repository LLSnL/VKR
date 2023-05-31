package shishanovrv.vkr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shishanovrv.vkr.model.Device;

@Repository
public interface DeviceRepo extends JpaRepository<Device, Integer> {
}
