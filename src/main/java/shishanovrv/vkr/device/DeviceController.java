package shishanovrv.vkr.device;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shishanovrv.vkr.DTO.DeviceDTO;
import shishanovrv.vkr.departmentOfSignalling.DepartmentOfSignalling;
import shishanovrv.vkr.dictionaryDevice.DictionaryDevice;

import java.math.BigDecimal;

@RestController
@RequestMapping("/device")
public class DeviceController {
    private final DeviceService service;
    @Autowired
    public DeviceController(DeviceService service) {
        this.service = service;
    }

    @PutMapping("/")
    @Operation(description = "Изменить данные об устройстве")
    public void edit(@RequestBody DeviceDTO deviceDTO){
        Device a = new Device();
        BeanUtils.copyProperties(deviceDTO, a);
        service.edit(a);
    }

    @PostMapping("/")
    @Operation(description = "Добавить устройство из списка")
    public void add(@RequestParam int dictionaryDeviceId, @RequestParam int departmentOfSignallingId, @RequestBody DeviceDTO deviceDto){
        service.add(dictionaryDeviceId, departmentOfSignallingId, deviceDto);
    }

    @DeleteMapping("/")
    @Operation(description = "Удалить данные по устройству")
    public void delete(@RequestParam Integer id){
        service.delete(id);
    }
}
