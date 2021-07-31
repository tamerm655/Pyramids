package pyramids;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PyramidCSVDAO {
    private List<Pyramid> pyramidsInfo;
    
    public PyramidCSVDAO()
    {
        
    }
    public List<Pyramid> readPyramidFromCSV(String fileName)
    {
        this.pyramidsInfo = new ArrayList<>();
        String[] fields = {};
        File file = new File(fileName);
        
        List<String> lines = new ArrayList<>();
        try{
            lines = Files.readAllLines(file.toPath());
        }catch(Exception e){
            System.out.println("Error during reading file:"+e);
        }
        
        for(int index = 0; index < lines.size(); index++){
            String line = lines.get(index);
            fields = line.split(",");
            
            for(int field = 0; field < fields.length; field++){
                fields[field] = fields[field].trim();
            }
            creatPyramid(fields);
        }
        return pyramidsInfo;
    }
           
    
    public Pyramid creatPyramid(String[] data)
    {
        Pyramid pyramid = new Pyramid();
        
        try{
                pyramid.set_Pharaoh_Name(data[0]);
            }catch(Exception e){
                pyramid.set_Pharaoh_Name("null");
            }
            
            try{
                pyramid.set_Modern_Name(data[2]);
            }catch(Exception e){
                pyramid.set_Modern_Name("null");
            }
            
            try{
                pyramid.set_Site(data[4]);
            }catch(Exception e){
                pyramid.set_Site("null");
            }
            
            try{
                pyramid.set_Hieght(Double.parseDouble(data[7]));
            }catch(Exception e){
                pyramid.set_Hieght(0);
            }
        
        pyramidsInfo.add(pyramid);
        return pyramid;
    }
    
}
