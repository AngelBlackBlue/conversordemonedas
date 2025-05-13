public class Conversion {

    private double conversionRate;
    private String baseCode;
    private String targetCode;


    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public Conversion (ConversionRate miConversionRate){
        this.conversionRate = miConversionRate.conversion_rate();
        this.baseCode = miConversionRate.base_code();
        this.targetCode = miConversionRate.target_code();
    }

    @Override
    public String toString() {
        return "El valor " + "tanto " +
                "["+ baseCode + "] " +
                "conversion=" + conversionRate +
                "corresponde al valor final de " + "calculo " +
                "["+ targetCode + "]";
    }

}
