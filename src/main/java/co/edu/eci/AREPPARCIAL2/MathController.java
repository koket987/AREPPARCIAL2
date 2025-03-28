package co.edu.eci.AREPPARCIAL2;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class MathController {
    @Autowired
    private MathService service;

    @GetMapping("/linearsearch")
    public MathModel searchLineal(@RequestParam String list , @RequestParam String value){
        String[] lista = list.split(",");
        System.out.println(lista);
        for (int i = 0 ; i < lista.length ; i++) {
            if (value.equals(lista[i])){;
                return service.mathService("linearSearch",list,value,i);
            }

        }

        return service.mathService("linearSearch",list,value,-1);
    }
    @GetMapping("/binarysearch")
    public MathModel binarySearch(@RequestParam String list, @RequestParam String value) {
        String[] inputList = list.split(",");
        int result = recursiveBinarySearch(inputList, value, 0, inputList.length - 1);

        return service.mathService("/binarySearch",list,value,result);
    }

    private static int recursiveBinarySearch(String[] inputList, String value, int izquierda, int derecha) {
        if (derecha >= izquierda) {
            int mid = izquierda + (derecha - izquierda) / 2;
            if (value.equals(inputList[mid])) {
                return mid;
            }
            if (Integer.parseInt(inputList[mid]) > Integer.parseInt(value)) {
                return recursiveBinarySearch(inputList, value, izquierda, mid - 1);
            }
            return recursiveBinarySearch(inputList, value, mid + 1, derecha);
        }
        return -1;
    }

}
