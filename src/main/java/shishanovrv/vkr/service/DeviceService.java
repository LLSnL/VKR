package shishanovrv.vkr.service;

import org.springframework.stereotype.Service;
import shishanovrv.vkr.DTO.DeviceDTO;
import shishanovrv.vkr.model.Device;
import shishanovrv.vkr.repo.DeviceRepo;

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

    public void add(DeviceDTO deviceDto){
        Device device = new Device();
        device.setDictionaryDevice(dictionaryDeviceService.getById(deviceDto.getDictionaryDeviceId()));
        device.setDepartmentOfSignalling(departmentOfSignallingService.getById(deviceDto.getDepartmentOfSignallingId()));
        device.setNumberOfUnits(deviceDto.getNumberOfUnits());
        device.setNumberOfPathsCoefficient(deviceDto.getNumberOfPathsCoefficient());
        device.setExpirationCoefficient(deviceDto.getExpirationCoefficient());
        device.setCategory(deviceDto.getCategory());
        departmentOfSignallingService.addToList(device, deviceDto.getDepartmentOfSignallingId());
    }
    public void edit(DeviceDTO deviceDTO) {
        Device updatedDevice = deviceRepo.getReferenceById(deviceDTO.getId());
        departmentOfSignallingService.removeFromList(updatedDevice.getDepartmentOfSignalling().getId(), updatedDevice);
        updatedDevice.setExpirationCoefficient(deviceDTO.getExpirationCoefficient());
        updatedDevice.setNumberOfUnits(deviceDTO.getNumberOfUnits());
        updatedDevice.setNumberOfPathsCoefficient(deviceDTO.getNumberOfPathsCoefficient());
        updatedDevice.setDictionaryDevice(dictionaryDeviceService.getById(deviceDTO.getDictionaryDeviceId()));
        updatedDevice.setDepartmentOfSignalling(departmentOfSignallingService.getById(deviceDTO.getDepartmentOfSignallingId()));
        updatedDevice.setCategory(deviceDTO.getCategory());
        departmentOfSignallingService.addToList(updatedDevice, deviceDTO.getDepartmentOfSignallingId());
    }
    public void delete(int id) {
        deviceRepo.deleteById(id);
    }

}
