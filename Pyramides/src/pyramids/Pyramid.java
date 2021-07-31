/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

/**
 *
 * @author Dubai
 */
public class Pyramid {
    private String pharaoh_Name;
    private String modern_Name;
    private String site;
    private double height;
    
     public Pyramid(){}
     public Pyramid(String pharaoh_Name, String modern_Name, String site, double height){
        this.pharaoh_Name = pharaoh_Name;
        this.modern_Name = modern_Name;
        this.site = site;
        this.height = height;
    }
     
     public void set_Pharaoh_Name(String pharaoh_Name)
     {
         this.pharaoh_Name = pharaoh_Name;
     }
     
     public void set_Modern_Name(String modern_Name)
     {
         this.modern_Name = modern_Name;
     }
     
     public void set_Site(String site)
     {
         this.site = site;
     }
     
     public void set_Hieght(double hieght)
     {
         this.height = hieght;
     }
     
     public String get_Pharaoh_Name()
     {
         return pharaoh_Name;
     }
     
     public String get_Modern_Name()
     {
         return modern_Name;
     }
     
     public String get_Site()
     {
         return site;
     }
     
     public double get_Hieght()
     {
         return height;
     }
     
}
