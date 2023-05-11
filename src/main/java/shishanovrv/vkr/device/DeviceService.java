package shishanovrv.vkr.device;

import org.springframework.stereotype.Service;
import shishanovrv.vkr.DTO.DeviceDTO;
import shishanovrv.vkr.departmentOfSignalling.DepartmentOfSignallingService;
import shishanovrv.vkr.dictionaryDevice.DictionaryDevice;
import shishanovrv.vkr.dictionaryDevice.DictionaryDeviceService;
import shishanovrv.vkr.repo.DeviceRepo;

import java.math.BigDecimal;

@Service
public class DeviceService {
    private final DeviceRepo deviceRepo;
    private final DictionaryDeviceService dictionaryDeviceService;
    private final DepartmentOfSignallingService departmentOfSignallingService;

    public DeviceService(DeviceRepo deviceRepo, DictionaryDeviceService dictionaryDeviceService, DepartmentOfSignallingService departmentOfSignallingService){
        this.deviceRepo = deviceRepo;
        this.departmentOfSignallingService = departmentOfSignallingService;
        this.dictionaryDeviceService = dictionaryDeviceService;
    }

    public void add(int dictionaryId, int DOSId, DeviceDTO deviceDto){
        Device device = new Device();
        device.setDictionaryDevice(dictionaryDeviceService.getById(dictionaryId));
        device.setDepartmentOfSignalling(departmentOfSignallingService.getById(DOSId));
        device.setNumberOfUnits(deviceDto.getNumberOfUnits());
        device.setNumberOfPathsCoefficient(deviceDto.getNumberOfPathsCoefficient());
        device.setExpirationCoefficient(deviceDto.getExpirationCoefficient());
        deviceRepo.save(device);
    }
    public void edit(Device device) {
        Device updatedDevice = deviceRepo.getReferenceById(device.getId());
        updatedDevice.copy(device);
        deviceRepo.save(updatedDevice);
    }
    public void delete(int id) {
        deviceRepo.deleteById(id);
    }

}
