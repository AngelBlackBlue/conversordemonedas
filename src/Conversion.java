public class Conversion {

    private double conversionRate;
    private String baseCode;
    private String targetCode;
    private double calculo;
    private double monto;


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

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Conversion (ConversionRate miConversionRate, double monto){
        this.conversionRate = miConversionRate.conversion_rate();
        this.baseCode = miConversionRate.base_code();
        this.targetCode = miConversionRate.target_code();
        this.calculo =  monto *  miConversionRate.conversion_rate();
        this.monto = monto;


    }

    @Override
    public String toString() {
        return "El valor " + monto +
                " ["+ baseCode + "] " +
                "corresponde al valor final de " + calculo +
                " ["+ targetCode + "]";
    }

}
