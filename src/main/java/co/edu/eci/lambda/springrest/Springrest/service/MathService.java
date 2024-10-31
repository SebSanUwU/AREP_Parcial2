package co.edu.eci.lambda.springrest.Springrest.service;

import co.edu.eci.lambda.springrest.Springrest.model.OutputFormat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MathService {
    public OutputFormat linealSearch(List<String> list, int value){
        List<Integer> integerList = listValuesInt(list);
        int indexFound = -1;
        for(int i = 0;i<integerList.size();i+=1){
            if (integerList.get(i) == value){
                indexFound = i;
                return new OutputFormat("linearSearch",list.toString(),String.valueOf(value),String.valueOf(indexFound));
            }
        }
        return new OutputFormat("linearSearch",list.toString(),String.valueOf(value),String.valueOf(indexFound));
    }

    public OutputFormat binarySearch(List<String> list,int value){
        List<Integer> integerList = listValuesInt(list);
        int startIndex = 0;
        int finalIndex = list.size()-1;
        return new OutputFormat("binarySearch",list.toString(),String.valueOf(value),String.valueOf(binarySearchAlgorithm(integerList,startIndex,finalIndex,value)));
    }

    private int binarySearchAlgorithm(List<Integer> list, int startIndex, int finalIndex, int value) {
        int midIndex = Math.floorDiv(finalIndex-startIndex,2);
        //System.out.println(startIndex+" "+midIndex+" "+finalIndex);
        if (startIndex == finalIndex){
            return -1;
        }
        if(list.get(midIndex) == value){
            return midIndex;
        }
        if(list.get(midIndex)>value){
            return binarySearchAlgorithm(list,midIndex,finalIndex,value);
        } else {
            return binarySearchAlgorithm(list,startIndex,midIndex,value);
        }
    }

    private List<Integer> listValuesInt(List<String> list){
        List<Integer> listValues = new ArrayList<Integer>();
        for(int i = 0;i<list.size();i+=1){
            listValues.add(Integer.valueOf(list.get(i)));
        }
        return listValues;
    }
}
