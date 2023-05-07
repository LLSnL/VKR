package shishanovrv.vkr.departmentOfSignalling;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import shishanovrv.vkr.device.Device;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DEPARTMENT_OF_SIGNALLING")
public class DepartmentOfSignalling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @OneToMany(mappedBy = "departmentOfSignalling", fetch = FetchType.LAZY)
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

    @Override
    public String toString() {
        return "DepartmentOfSignalling{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deviceList=" + deviceList +
                '}';
    }

    public void copy(DepartmentOfSignalling departmentOfSignalling){
        name = departmentOfSignalling.getName();
        deviceList = departmentOfSignalling.getDeviceList();
    }
}
