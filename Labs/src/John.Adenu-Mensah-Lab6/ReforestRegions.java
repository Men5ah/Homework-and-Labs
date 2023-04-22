import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.io.File;
import java.io.FileNotFoundException;

public class ReforestRegions {
    private ArrayList<Region> reforestGhana = new ArrayList<Region>();


    public double averageNumberOfTrees(ArrayList<String> numberOfRegionTrees){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numberOfRegionTrees.size(); i++){
            int value = Integer.parseInt(numberOfRegionTrees.get(i));
            sum += value;
            count ++;
        }
        double average = sum/count;
        return average;
    }

    public Region highestNumberOfTrees(ArrayList<Region> reforestGhana){
        int maxValue = reforestGhana.get(0).getTreesPlanted();
        Region max = reforestGhana.get(0);
        for (int i = 0; i < reforestGhana.size(); i++){
            int currValue = reforestGhana.get(i).getTreesPlanted();
            if(currValue>=maxValue){
                maxValue = currValue;
                max = reforestGhana.get(i);
            }
        }
        return max;
    }

    // public Region maxNumberOfTrees(ArrayList<String> numberOfRegionTrees, ArrayList<Region> reforestGhana){
    //     int maxVal = Integer.parseInt(numberOfRegionTrees.get(0));
    //     for (int i = 0; i < numberOfRegionTrees.size(); i++) {  
    //         int currVal = Integer.parseInt(numberOfRegionTrees.get(i));
    //         if(currVal>=maxVal){
    //             maxVal = currVal;
    //         }
    //     }
    //     String largestVal = Integer.toString(maxVal);
    //     Region keyVal = reforestGhana.get(0);
    //     for(int i=0; i<reforestGhana.size(); i++){
    //         if(largestVal.equals(reforestGhana.get(i))){
    //         keyVal = reforestGhana.get(i);
    //         }
    //     }
    //     return keyVal;
    // }
    public Region lowestNumberOfTrees(ArrayList<Region> reforestGhana){
        int minValue = reforestGhana.get(0).getTreesPlanted();
        Region min = reforestGhana.get(0);
        for (int i = 0; i < reforestGhana.size(); i++){
            int currValue = reforestGhana.get(i).getTreesPlanted();
            if(currValue<=minValue){
                minValue = currValue;
                min = reforestGhana.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {

        ReforestRegions r = new ReforestRegions();

        ArrayList<String> regionsofGhana = new ArrayList<String>();
        ArrayList<String> numberOfRegionTrees = new ArrayList<String>();

        try {
            File reforestFile = new File("./reforestation-1.csv");

            Scanner read = new Scanner(reforestFile);
            if (!read.hasNextLine())
                System.exit(1);

            for (String region : read.nextLine().split(",")) {
                regionsofGhana.add(region);
            }

            for (String trees : read.nextLine().split(",")) {
                numberOfRegionTrees.add(trees);
            }

            for (int i = 0; i < regionsofGhana.size(); i++) {

                int treesAsInt = Integer.parseInt(numberOfRegionTrees.get(i));
                Region currentRegion = new Region(regionsofGhana.get(i), treesAsInt);
                r.reforestGhana.add(currentRegion);

            }

            //var f = java.util.stream.IntStream.range(0, regionsofGhana.size())
                   // .mapToObj(i -> new Region(regionsofGhana.get(i), Integer.parseInt(numberOfRegionTrees.get(i))))
                   // .collect(java.util.stream.Collectors.toList());

            // Arrays.asList(read.nextLine().split(",")).forEach(t ->
            // System.out.println(t));

            //System.out.println(regionsofGhana);
            //System.out.println(numberOfRegionTrees);
            //System.out.println(r.reforestGhana.get(0).getTreesPlanted());
            System.out.println(r.averageNumberOfTrees(numberOfRegionTrees));
            System.out.println(r.highestNumberOfTrees(r.reforestGhana));
            System.out.println(r.lowestNumberOfTrees(r.reforestGhana));

        } catch (FileNotFoundException e) {

            e.printStackTrace();
            System.exit(1);
        }
        
    }

}
