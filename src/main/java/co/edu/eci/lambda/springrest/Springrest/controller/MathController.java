package co.edu.eci.lambda.springrest.Springrest.controller;

import co.edu.eci.lambda.springrest.Springrest.model.OutputFormat;
import co.edu.eci.lambda.springrest.Springrest.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class MathController {
    @Autowired
    private MathService mathService;
    @GetMapping("/linearsearch")
    public ResponseEntity<OutputFormat> getLinearSearch(@RequestParam("list") String list,@RequestParam("value") int value){
        String[] listArray = list.split(",");
        //System.out.println(list);
        OutputFormat output = mathService.linealSearch(List.of(listArray),value);
        //System.out.println(output.getOutput());
        return ResponseEntity.ok(output);
    }

    @GetMapping("/binarysearch")
    public ResponseEntity<OutputFormat> getBinarySearch(@RequestParam("list") String list,@RequestParam("value") int value){
        String[] listArray = list.split(",");
        //System.out.println(list);
        OutputFormat output = mathService.binarySearch(List.of(listArray),value);
        //System.out.println(output.getOutput());
        return ResponseEntity.ok(output);
    }
}
