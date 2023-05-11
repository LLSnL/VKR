package shishanovrv.vkr.departmentOfSignalling;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shishanovrv.vkr.DTO.DepartmentDTO;
import shishanovrv.vkr.DTO.DictionaryDeviceDTO;
import shishanovrv.vkr.dictionaryDevice.DictionaryDevice;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentOfSignallingController {

    private final DepartmentOfSignallingService service;
    @Autowired
    public DepartmentOfSignallingController(DepartmentOfSignallingService service){this.service = service;}
    @PostMapping("/")
    @Operation(description = "Создать запись о СЦБ")
    public void add(@RequestBody DepartmentDTO departmentOfSignallingDTO){
        DepartmentOfSignalling a = new DepartmentOfSignalling();
        BeanUtils.copyProperties(departmentOfSignallingDTO, a);
        service.add(a);
    }
    @GetMapping("/")
    @Operation(description = "Вывести список всех СЦБ")
    public List<DepartmentDTO> getAllDepartaments(){
        List<DepartmentOfSignalling> departmentList = service.getDosList();
        List<DepartmentDTO> dtoList = new ArrayList<>();
        for (DepartmentOfSignalling a:
                departmentList) {
            DepartmentDTO dto = new DepartmentDTO();
            BeanUtils.copyProperties(a, dto);
            dtoList.add(dto);
        }
        return dtoList;
    }
}
