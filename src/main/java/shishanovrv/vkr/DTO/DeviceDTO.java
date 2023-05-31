package shishanovrv.vkr.DTO;

public class DeviceDTO {
    private Integer id;
    private Integer numberOfUnits;
    private Integer numberOfPathsCoefficient;
    private Integer category;
    private Integer expirationCoefficient;
    private Integer dictionaryDeviceId;
    private Integer departmentOfSignallingId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    public Integer getExpirationCoefficient() {
        return expirationCoefficient;
    }
    public void setExpirationCoefficient(Integer expirationCoefficient) {
        this.expirationCoefficient = expirationCoefficient;
    }
    public Integer getDictionaryDeviceId() {
        return dictionaryDeviceId;
    }
    public void setDictionaryDeviceId(Integer dictionaryDeviceId) {
        this.dictionaryDeviceId = dictionaryDeviceId;
    }
    public Integer getDepartmentOfSignallingId() {
        return departmentOfSignallingId;
    }
    public void setDepartmentOfSignallingId(Integer departmentOfSignallingId) {
        this.departmentOfSignallingId = departmentOfSignallingId;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public DeviceDTO() {
    }

    public DeviceDTO(Integer category, Integer id, Integer numberOfUnits, Integer numberOfPathsCoefficient, Integer expirationCoefficient, Integer dictionaryDeviceId, Integer departmentOfSignallingId) {
        this.id = id;
        this.category = category;
        this.numberOfUnits = numberOfUnits;
        this.numberOfPathsCoefficient = numberOfPathsCoefficient;
        this.expirationCoefficient = expirationCoefficient;
        this.dictionaryDeviceId = dictionaryDeviceId;
        this.departmentOfSignallingId = departmentOfSignallingId;
    }
}
