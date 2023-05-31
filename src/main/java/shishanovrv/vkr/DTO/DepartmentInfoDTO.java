package shishanovrv.vkr.DTO;

import java.util.List;

public class DepartmentInfoDTO {
    private String name;
    private List<String> devices;
    private double numberOfWorkers;

    public DepartmentInfoDTO(String name, List<String> devices, double numberOfWorkers) {
        this.name = name;
        this.devices = devices;
        this.numberOfWorkers = numberOfWorkers;
    }

    public DepartmentInfoDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDevices() {
        return devices;
    }

    public void setDevices(List<String> devices) {
        this.devices = devices;
    }

    public double getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(double numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }
}
