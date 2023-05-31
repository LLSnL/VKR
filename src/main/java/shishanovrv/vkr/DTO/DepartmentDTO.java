package shishanovrv.vkr.DTO;

import java.util.List;

public class DepartmentDTO {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private List<DeviceDTO> devices;

    public List<DeviceDTO> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceDTO> devices) {
        this.devices = devices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentDTO() {
    }

    public DepartmentDTO(Integer id, String name, List<DeviceDTO> devices) {
        this.id = id;
        this.name = name;
        this.devices = devices;
    }
}
