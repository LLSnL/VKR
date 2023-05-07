package shishanovrv.vkr.DTO;

import shishanovrv.vkr.device.Device;
import java.util.List;

public class DepartmentDTO {
    private Integer id;
    private String name;
    private List<Device> deviceList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Device> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<Device> deviceList) {
        this.deviceList = deviceList;
    }

    public DepartmentDTO() {
    }

    public DepartmentDTO(Integer id, String name, List<Device> deviceList) {
        this.id = id;
        this.name = name;
        this.deviceList = deviceList;
    }
}
