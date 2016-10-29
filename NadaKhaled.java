
 
package nada.khaled;

public class NadaKhaled {

    
    public static void main(String[] args) {
        
        
        
                
                
                
                //Insert Data     
         
		/*Product testpat = new Product();
		testpat.setPID("12nk34");
		testpat.setType("n");
		testpat.setManufacturer("Egypt");
		testpat.setPDate("2020-5-1");
		testpat.setEDate("2020-9-8");
		DAOImpl newtest = new DAOImpl();
		newtest.insert_product(testpat);*/
                
                
                
                
                //Update Row 
    
               /* Product Up = new Product();
		Up.setPID("11AA34");
		Up.setType("A");
		Up.setManufacturer("Egypt");
		Up.setPDate("2016-09-01");
		Up.setEDate("2016-02-23");
		DAOImpl Update = new DAOImpl();
		Update.updateProduct(Up);*/
                
                
                
    //Delete Row By ID
                
                /*Product del = new Product();
		del.setPID("12nk34");
		DAOImpl Delete = new DAOImpl();
		Delete.deleteProduct(del);*/
                
                
    
        
               
    //Retrieve Data by Manufacture 
    
                Product Ret = new Product();
		Ret.setManufacturer("Egypt");
		DAOImpl Retrieve = new DAOImpl();
		Retrieve.RetrieveProduct(Ret);
                
                
        
        
    }
    
}
