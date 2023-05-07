package shishanovrv.vkr.device;

import com.fasterxml.jackson.annotation.JsonBackReference;
import shishanovrv.vkr.departmentOfSignalling.DepartmentOfSignalling;
import shishanovrv.vkr.dictionaryDevice.DictionaryDevice;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "DEVICE")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "DICTIONARY_DEVICE_ID", referencedColumnName = "id")
    private DictionaryDevice dictionaryDevice;

    @ManyToOne
    @JoinColumn(name = "DOS_ID", referencedColumnName = "id")
    private DepartmentOfSignalling departmentOfSignalling;

    @Column(name = "NUMBER_OF_UNITS")
    private Integer numberOfUnits;

    @Column(name = "NUMBER_OF_PATHS_COEFFICIENT")
    private Integer numberOfPathsCoefficient;

    @Column(name = "EXPIRATION_COEFFICIENT")
    private BigDecimal expirationCoefficient;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DictionaryDevice getDictionaryDevice() {
        return dictionaryDevice;
    }

    public void setDictionaryDevice(DictionaryDevice dictionaryDevice) {
        this.dictionaryDevice = dictionaryDevice;
    }

    public DepartmentOfSignalling getDepartmentOfSignalling() {
        return departmentOfSignalling;
    }

    public void setDepartmentOfSignalling(DepartmentOfSignalling departmentOfSignalling) {
        this.departmentOfSignalling = departmentOfSignalling;
    }

    public Integer getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(Integer numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public Integer getNumberOfPathsCoefficient() {
        return numberOfPathsCoefficient;
    }

    public void setNumberOfPathsCoefficient(Integer numberOfPathsCoefficient) {
        this.numberOfPathsCoefficient = numberOfPathsCoefficient;
    }

    public BigDecimal getExpirationCoefficient() {
        return expirationCoefficient;
    }

    public void setExpirationCoefficient(BigDecimal expirationCoefficient) {
        this.expirationCoefficient = expirationCoefficient;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", dictionaryDevice=" + dictionaryDevice +
                ", departmentOfSignalling=" + departmentOfSignalling +
                ", numberOfUnits=" + numberOfUnits +
                ", numberOfPathsCoefficient=" + numberOfPathsCoefficient +
                ", expirationCoefficient=" + expirationCoefficient +
                '}';
    }

    public void copy(Device device){
        dictionaryDevice = device.getDictionaryDevice();
        departmentOfSignalling = device.getDepartmentOfSignalling();
        numberOfUnits = device.getNumberOfUnits();
        numberOfPathsCoefficient = device.getNumberOfPathsCoefficient();
        expirationCoefficient = device.getExpirationCoefficient();
        dictionaryDevice = device.getDictionaryDevice();
    }
}
