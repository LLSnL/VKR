package shishanovrv.vkr.model;

import javax.persistence.*;

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

    @Column(name = "CATEGORY")
    private Integer category;

    @Column(name = "NUMBER_OF_UNITS")
    private Integer numberOfUnits;

    /*Записывается в коэффициент * 100*/
    @Column(name = "NUMBER_OF_PATHS_COEFFICIENT")
    private Integer numberOfPathsCoefficient;

    /*Записывается в коэффициент * 100*/
    @Column(name = "EXPIRATION_COEFFICIENT")
    private Integer expirationCoefficient;

    public Device(DictionaryDevice dictionaryDevice, DepartmentOfSignalling departmentOfSignalling, Integer category, Integer numberOfUnits, Integer numberOfPathsCoefficient, Integer expirationCoefficient) {
        this.dictionaryDevice = dictionaryDevice;
        this.departmentOfSignalling = departmentOfSignalling;
        this.category = category;
        this.numberOfUnits = numberOfUnits;
        this.numberOfPathsCoefficient = numberOfPathsCoefficient;
        this.expirationCoefficient = expirationCoefficient;
    }

    public Device() {
    }

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

    public Integer getExpirationCoefficient() {
        return expirationCoefficient;
    }

    public void setExpirationCoefficient(Integer expirationCoefficient) {
        this.expirationCoefficient = expirationCoefficient;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", dictionaryDevice=" + dictionaryDevice +
                ", departmentOfSignalling=" + departmentOfSignalling +
                ", category=" + category +
                ", numberOfUnits=" + numberOfUnits +
                ", numberOfPathsCoefficient=" + numberOfPathsCoefficient +
                ", expirationCoefficient=" + expirationCoefficient +
                '}';
    }

    public void copy(Device device){
        category = device.getCategory();
        dictionaryDevice = device.getDictionaryDevice();
        departmentOfSignalling = device.getDepartmentOfSignalling();
        numberOfUnits = device.getNumberOfUnits();
        numberOfPathsCoefficient = device.getNumberOfPathsCoefficient();
        expirationCoefficient = device.getExpirationCoefficient();
        dictionaryDevice = device.getDictionaryDevice();
    }
}
