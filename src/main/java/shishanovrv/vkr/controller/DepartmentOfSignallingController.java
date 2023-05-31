package shishanovrv.vkr.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shishanovrv.vkr.DTO.DepartmentInfoDTO;
import shishanovrv.vkr.model.DepartmentOfSignalling;
import shishanovrv.vkr.service.DepartmentOfSignallingService;
import shishanovrv.vkr.model.Device;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentOfSignallingController {

    private final DepartmentOfSignallingService service;

    @Autowired
    public DepartmentOfSignallingController(DepartmentOfSignallingService service) {
        this.service = service;
    }

    @PostMapping("/")
    @Operation(description = "Создать запись о СЦБ")
    public void add(@RequestParam String name) {
        service.add(name);
    }

    @GetMapping("/")
    @Operation(description = "Вывести список всех СЦБ")
    public List<DepartmentInfoDTO> getAllDepartments() {
        double k, p;
        List<DepartmentOfSignalling> departmentList = service.getDosList();
        List<DepartmentInfoDTO> infoList = new ArrayList<>();
        for (DepartmentOfSignalling b :
                departmentList) {
            k = 0;
            DepartmentInfoDTO l = new DepartmentInfoDTO();
            List<String> devices = new ArrayList<>();
            l.setName(b.getName());
            for (Device a :
                    b.getDeviceList()) {
                if (a.getCategory() == 1 && a.getCategory() == 2) {
                    p = a.getNumberOfUnits() * a.getNumberOfPathsCoefficient() * a.getExpirationCoefficient()
                            * a.getDictionaryDevice().getValueOfTechnicalUnitForFirstAndSecondCategories();
                } else {
                    p = a.getNumberOfUnits() * a.getNumberOfPathsCoefficient() * a.getExpirationCoefficient()
                            * a.getDictionaryDevice().getValueOfTechnicalUnitForThirdAndForthCategories();
                }
                p = p / a.getDictionaryDevice().getUnitOfMeasurementSize()
                        / a.getDictionaryDevice().getValueCoefficient() / 10000;
                k+=p;
                devices.add(a.getDictionaryDevice().getName());
            }
            l.setNumberOfWorkers(Math.ceil(k));
            l.setDevices(devices);
            infoList.add(l);
        }
        return infoList;
    }

    @PutMapping("/")
    @Operation(description = "Изменить данные об СЦБ")
    public void edit(@RequestParam int id, @RequestParam String name) {
        service.edit(id, name);
    }

    @DeleteMapping
    @Operation(description = "Удалить СЦБ и все связанные устройства")
    public void delete(@RequestParam Integer id) {
        service.delete(id);
    }

}
