package shishanovrv.vkr.device;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shishanovrv.vkr.DTO.DeviceDTO;

@RestController
@RequestMapping("/device")
public class DeviceController {
    private final DeviceService service;
    @Autowired
    public DeviceController(DeviceService service) {
        this.service = service;
    }

//    @PutMapping("/")
//    @Operation(description = "Изменить устройство")
//    public void edit(@RequestBody DeviceDTO deviceDTO){
//        Device a = new Device();
//        BeanUtils.copyProperties(deviceDTO, a);
//        service.edit(a);
//    }

    @DeleteMapping("/")
    @Operation(description = "Удалить устройство")
    public void delete(@RequestParam Integer id){
        service.delete(id);
    }
}
