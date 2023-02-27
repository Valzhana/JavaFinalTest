public class LapTop {
    private String brand;
    private String name;
    private int productCode;
    private Double price;
    private Double diagonal;
    private String CPU;
    private int RAM;
    private int SSD;
    private String operatingSystem;
    private String color;
    private Double weight;
    private Boolean inStock;

    public LapTop(String brand, String name, int productCode, Double price, Double diagonal, String CPU, int RAM, int SSD, String operatingSystem, String color, Double weight, Boolean inStock) {
        this.brand = brand;
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.diagonal = diagonal;
        this.CPU = CPU;
        this.RAM = RAM;
        this.SSD = SSD;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.weight = weight;
        this.inStock = inStock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return String.format(
                "brand = %s, name = %s, code = %d, price = %.1f, diagonal = %.1f, CPU = %s, RAM = %d, SSD = %d, OS = %s, color = %s, weight = %.1f, in stock = %s\n", brand, name, productCode, price, diagonal, CPU, RAM, SSD, operatingSystem, color, weight, inStock);
    }

    public void printInfo() {
        System.out.printf("BRAND: %s; NAME: %s; CODE: %d; PRICE: %.1f; DIAGONAL: %.1f; CPU: %s; RAM: %d; SSD: %d; OS: %s; COLOR: %s; WEIGHT: %.1f; IN STOCK: %s", brand, name, productCode, price, diagonal, CPU, RAM, SSD, operatingSystem, color, weight, inStock);
    }
}
