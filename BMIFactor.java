
/**
 * Class that manage the BMI Factor
 * @author Marcos Rodriguez
 */
public class BMIFactor {    
    private static double _weight;
    private static double _height;
    private static double _bmi;
    private static String _analysis;

    /**
     *
     * @return the weight in pound
     */
    public static double getWeight() {
        return _weight;
    }

    /**
     *
     * @return the height in meters
     */
    public static double getHeight() {
        return _height;
    }
    
    /**
     *
     * @return the BMI factor
     */
    public static double getBMI() {
        return _bmi;
    }
    
    /**
     *
     * @return the analysis to respond to the user
     */
    public String getAnalysis() {
        return _analysis;
    }
    
    /**
     * Constructor that initialize the BMI calculator
     * @param weight The weight of the person in pounds
     * @param height The height of the person in inches
     */
    public BMIFactor(double weight, double height) {
        _weight = convertPoundsToKG(weight);
        _height = convertInchsToMeters(height);
        this.calculateBMI();
        this.doAnalysis();
    }
    
    private double convertPoundsToKG(double pounds){
        return (pounds * 0.4536);
    }
    private double convertInchsToMeters(double inchs) {
        return (inchs * 0.0254);
    }
    
    private void calculateBMI() {        
        _bmi = _weight /(_height * _height);       
    }
    
    private void doAnalysis(){
        if (_bmi <= 18.5) {
            _analysis = "Your BMI value is: " + String.valueOf(_bmi) + ", this indicates that you are underweight.";
        }
        
        if (_bmi > 18.5 && _bmi < 25) {
            _analysis = "Your BMI value is: " + String.valueOf(_bmi) + ", this indicates that your weight is ideal.";
        }
        
        if (_bmi >= 25) {
            _analysis = "Your BMI value is: " + String.valueOf(_bmi) + ", this indicates that you are overweight.";
        }
    }  
}
