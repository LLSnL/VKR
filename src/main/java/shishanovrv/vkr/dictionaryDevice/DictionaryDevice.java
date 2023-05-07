package shishanovrv.vkr.dictionaryDevice;

import shishanovrv.vkr.device.Device;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DICTIONARY_DEVICE")
public class DictionaryDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "UNIT_OF_MEASUREMENT_SIZE")
    private Integer unitOfMeasurementSize;
    @Column(name = "UNIT_OF_MEASUREMENT_NAME")
    private String unitOfMeasurementName;
    @Column(name = "VALUE_OF_TECHNICAL_UNIT_FOR_FIRST_AND_SECOND_CATEGORIES")
    private Integer valueOfTechnicalUnitForFirstAndSecondCategories;
    @Column(name = "VALUE_OF_TECHNICAL_UNIT_FOR_THIRD_AND_FORTH_CATEGORIES")
    private Integer valueOfTechnicalUnitForThirdAndForthCategories;
    @Column(name = "VALUE_COEFFICIENT")
    private Integer valueCoefficient;
    @OneToOne(mappedBy = "dictionaryDevice", fetch = FetchType.LAZY)
    private Device device;

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

    public Integer getUnitOfMeasurementSize() {
        return unitOfMeasurementSize;
    }

    public void setUnitOfMeasurementSize(Integer unitOfMeasurementSize) {
        this.unitOfMeasurementSize = unitOfMeasurementSize;
    }

    public String getUnitOfMeasurementName() {
        return unitOfMeasurementName;
    }

    public void setUnitOfMeasurementName(String unitOfMeasurementName) {
        this.unitOfMeasurementName = unitOfMeasurementName;
    }

    public Integer getValueOfTechnicalUnitForFirstAndSecondCategories() {
        return valueOfTechnicalUnitForFirstAndSecondCategories;
    }

    public void setValueOfTechnicalUnitForFirstAndSecondCategories(Integer valueOfTechnicalUnitForFirstAndSecondCategories) {
        this.valueOfTechnicalUnitForFirstAndSecondCategories = valueOfTechnicalUnitForFirstAndSecondCategories;
    }

    public Integer getValueOfTechnicalUnitForThirdAndForthCategories() {
        return valueOfTechnicalUnitForThirdAndForthCategories;
    }

    public void setValueOfTechnicalUnitForThirdAndForthCategories(Integer valueOfTechnicalUnitForThirdAndForthCategories) {
        this.valueOfTechnicalUnitForThirdAndForthCategories = valueOfTechnicalUnitForThirdAndForthCategories;
    }

    public Integer getValueCoefficient() {
        return valueCoefficient;
    }

    public void setValueCoefficient(Integer valueCoefficient) {
        this.valueCoefficient = valueCoefficient;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "DictionaryDevice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unitOfMeasurementSize=" + unitOfMeasurementSize +
                ", unitOfMeasurementName='" + unitOfMeasurementName + '\'' +
                ", valueOfTechnicalUnitForFirstAndSecondCategories=" + valueOfTechnicalUnitForFirstAndSecondCategories +
                ", valueOfTechnicalUnitForThirdAndForthCategories=" + valueOfTechnicalUnitForThirdAndForthCategories +
                ", valueCoefficient=" + valueCoefficient +
                ", deviceList=" + device +
                '}';
    }

    public void copy(DictionaryDevice dictionaryDevice){
        name = dictionaryDevice.getName();
        unitOfMeasurementSize = dictionaryDevice.getUnitOfMeasurementSize();
        unitOfMeasurementName = dictionaryDevice.getUnitOfMeasurementName();
        valueOfTechnicalUnitForFirstAndSecondCategories = dictionaryDevice.getValueOfTechnicalUnitForFirstAndSecondCategories();
        valueOfTechnicalUnitForThirdAndForthCategories = dictionaryDevice.getValueOfTechnicalUnitForThirdAndForthCategories();
        valueCoefficient = dictionaryDevice.getValueCoefficient();
        device = dictionaryDevice.getDevice();
    }
}
