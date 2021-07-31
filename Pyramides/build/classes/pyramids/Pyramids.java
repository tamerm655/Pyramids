package pyramids;

import java.io.FileNotFoundException;
import java.util.List;

public class Pyramids {

    public static void main(String[] args){
        
        PyramidCSVDAO DAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = DAO.readPyramidFromCSV("D:\\Java_course\\day_2\\pyramids.csv");
        
        int i = 0;
        for(Pyramid p:pyramids)
        {
            System.out.print("# "+(i++) + " " + p.get_Pharaoh_Name());
            System.out.print(" " + p.get_Modern_Name());
            System.out.print(" " + p.get_Site());
            System.out.println(" " + p.get_Hieght());
        }
    }
    
}
