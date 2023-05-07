package shishanovrv.vkr.DTO;

public class DictionaryDeviceDTO {
    private Integer id;

    private String name;

    private Integer unitOfMeasurementSize;

    private String unitOfMeasurementName;

    private Integer valueOfTechnicalUnitForFirstAndSecondCategories;

    private Integer valueOfTechnicalUnitForThirdAndForthCategories;

    private Integer valueCoefficient;

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

    public DictionaryDeviceDTO() {
    }

    public DictionaryDeviceDTO(Integer id, String name, Integer unitOfMeasurementSize, String unitOfMeasurementName, Integer valueOfTechnicalUnitForFirstAndSecondCategories, Integer valueOfTechnicalUnitForThirdAndForthCategories, Integer valueCoefficient) {
        this.id = id;
        this.name = name;
        this.unitOfMeasurementSize = unitOfMeasurementSize;
        this.unitOfMeasurementName = unitOfMeasurementName;
        this.valueOfTechnicalUnitForFirstAndSecondCategories = valueOfTechnicalUnitForFirstAndSecondCategories;
        this.valueOfTechnicalUnitForThirdAndForthCategories = valueOfTechnicalUnitForThirdAndForthCategories;
        this.valueCoefficient = valueCoefficient;
    }


}
