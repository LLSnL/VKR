package shishanovrv.vkr.service;

import shishanovrv.vkr.model.DictionaryDevice;
import shishanovrv.vkr.repo.DictionaryDeviceRepo;

import java.util.List;

@org.springframework.stereotype.Service
public class DictionaryDeviceService {
    private final DictionaryDeviceRepo deviceRepo;

    public DictionaryDeviceService(DictionaryDeviceRepo deviceRepo) {
        this.deviceRepo = deviceRepo;
    }

    public List<DictionaryDevice> getDeviceList() {
        return deviceRepo.findAll();
    }

    public void add(DictionaryDevice dictionaryDevice) {
        deviceRepo.save(dictionaryDevice);
    }

    public void edit(DictionaryDevice dictionaryDevice) {
        DictionaryDevice updatedDevice = deviceRepo.getReferenceById(dictionaryDevice.getId());
        updatedDevice.copy(dictionaryDevice);
        deviceRepo.save(updatedDevice);
    }

    public void delete(int id) {
        deviceRepo.deleteById(id);
    }

    public DictionaryDevice getById(int id){return deviceRepo.getReferenceById(id);}
}
