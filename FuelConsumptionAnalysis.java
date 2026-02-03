public class FuelConsumptionAnalysis {
    public static void main(String[] args){
        double[] fuelConsumption = {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};
        double total =0;
        int highCount = 0;
        int normalCount = 0;
        int lowCount = 0;
        int i = 0;
        double max = 0;
        int dayNumber = 0;

        while(i < fuelConsumption.length){
            if(fuelConsumption[i] > 20){
                System.out.println((i+1)+". " + fuelConsumption[i]+": High Consumption");
                highCount += 1;
            }else if( fuelConsumption[i] > 10 && fuelConsumption[i] <= 20){
                System.out.println((i+1)+". "+ fuelConsumption[i]+": Normal Consumption");
                normalCount += 1;
            }else{
                System.out.println((i+1)+". " + fuelConsumption[i]+": low Consumption");
                lowCount += 1;
            }

            for(int j = 0; j < fuelConsumption.length; j++){
                if(fuelConsumption[j] > max){
                    max = fuelConsumption[j];
                    dayNumber = j + 1;
                }
            }

            total += fuelConsumption[i];
            i++;
        }



        double Average = total / i;
        System.out.printf("Total Consumption: %.2f\n", total);
        System.out.printf("Average Consumption: %.2f \n", Average);

        System.out.println("High count- "+highCount);
        System.out.println("Normal count- "+normalCount);
        System.out.println("Low count- "+lowCount);
        System.out.println("Peak Consumption: "+max);
        System.out.println("On day Number: " + dayNumber);
    }
}
