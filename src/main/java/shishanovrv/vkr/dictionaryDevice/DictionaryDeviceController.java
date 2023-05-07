package shishanovrv.vkr.dictionaryDevice;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import shishanovrv.vkr.DTO.DictionaryDeviceDTO;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/dictionary")
public class DictionaryDeviceController {
    private final DictionaryDeviceService service;
    @Autowired
    public DictionaryDeviceController(DictionaryDeviceService service) {
        this.service = service;
    }

    @GetMapping("/")
    @Operation(description = "Вывести список всех устройств")
    public List<DictionaryDeviceDTO> getAllDictionaryDevice(){
        List<DictionaryDevice> dictionaryDeviceList = service.getDeviceList();
        List<DictionaryDeviceDTO> dtoList = new ArrayList<>();
        for (DictionaryDevice a:
             dictionaryDeviceList) {
            DictionaryDeviceDTO dto = new DictionaryDeviceDTO();
            BeanUtils.copyProperties(a, dto);
            dtoList.add(dto);
        }
        return dtoList;
    }
    @PostMapping("/")
    @Operation(description = "Добавить устройство")
    public void add(@RequestBody DictionaryDeviceDTO dictionaryDeviceDTO){
        DictionaryDevice a = new DictionaryDevice();
        BeanUtils.copyProperties(dictionaryDeviceDTO, a);
        service.add(a);
    }
    @PutMapping("/")
    @Operation(description = "Редактировать данные по устройству")
    public void edit(@RequestBody DictionaryDeviceDTO dictionaryDeviceDTO){
        DictionaryDevice a = new DictionaryDevice();
        BeanUtils.copyProperties(dictionaryDeviceDTO, a);
        service.edit(a);
    }
    @DeleteMapping("/")
    @Operation(description = "Удалить устройство")
    public void delete(@RequestParam Integer id){
        service.delete(id);
    }
}
