package co.edu.eci.AREPPARCIAL2;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public MathModel mathService(String operation, String list, String value, int output){
        return new MathModel(operation,list,value,output);
    }
}
