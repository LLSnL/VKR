package shishanovrv.vkr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shishanovrv.vkr.dictionaryDevice.DictionaryDevice;

@Repository
public interface DictionaryDeviceRepo extends JpaRepository<DictionaryDevice, Integer> {
}
