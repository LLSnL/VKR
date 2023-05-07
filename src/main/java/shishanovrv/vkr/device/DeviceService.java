package shishanovrv.vkr.device;

import org.springframework.stereotype.Service;
import shishanovrv.vkr.dictionaryDevice.DictionaryDevice;
import shishanovrv.vkr.repo.DeviceRepo;

@Service
public class DeviceService {
    private final DeviceRepo deviceRepo;
    public DeviceService(DeviceRepo deviceRepo){
        this.deviceRepo = deviceRepo;
    }

//        public void add(Device device, int dictionaryId, int DOSId){
//        device.setDictionaryDevice();
//        device.setDepartmentOfSignalling();
//        deviceRepo.save(device);
//    }
    public void edit(Device device) {
        Device updatedDevice = deviceRepo.getReferenceById(device.getId());
        updatedDevice.copy(device);
        deviceRepo.save(updatedDevice);
    }
    public void delete(int id) {
        deviceRepo.deleteById(id);
    }

}
