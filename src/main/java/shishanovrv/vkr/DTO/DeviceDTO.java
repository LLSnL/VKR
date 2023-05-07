package shishanovrv.vkr.DTO;

import shishanovrv.vkr.departmentOfSignalling.DepartmentOfSignalling;
import shishanovrv.vkr.dictionaryDevice.DictionaryDevice;

import java.math.BigDecimal;

public class DeviceDTO {
    private Integer id;
    private DictionaryDevice dictionaryDevice;
    private DepartmentOfSignalling departmentOfSignalling;
    private Integer numberOfUnits;
    private Integer numberOfPathsCoefficient;
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

    public DeviceDTO() {
    }

    public DeviceDTO(Integer id, DictionaryDevice dictionaryDevice, DepartmentOfSignalling departmentOfSignalling, Integer numberOfUnits, Integer numberOfPathsCoefficient, BigDecimal expirationCoefficient) {
        this.id = id;
        this.dictionaryDevice = dictionaryDevice;
        this.departmentOfSignalling = departmentOfSignalling;
        this.numberOfUnits = numberOfUnits;
        this.numberOfPathsCoefficient = numberOfPathsCoefficient;
        this.expirationCoefficient = expirationCoefficient;
    }
}
