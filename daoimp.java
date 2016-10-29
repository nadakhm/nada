/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nada.khaled;

/**
 *
 * @author HDM
 */
public class daoimp implements Dao {
    
    /*
     *
     * @param product
     */
    @Override
	public void insert_product(product product){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nadaproduct", "root", "");
                        // the mysql insert statement
                          String query = " INSERT INTO product1 (PID,  PDate, EDate ,Type, Manufacturer)"
                           + " values (?, ?, ?, ?, ?)";
                        
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, product.getPID());
			
			psmt.setString(2, product.getPDate());
			psmt.setString(3, product.getEDate());
                        psmt.setString(4, product.getType());
			psmt.setString(5, product.getManufacturer());
			int i = psmt.executeUpdate();
			if (i > 0) {
				JOptionPane.showMessageDialog(null, "Product was successfully added");
			}
			else {
				JOptionPane.showMessageDialog(null, "Product was not added");
			}
		}
		catch (ClassNotFoundException | SQLException | HeadlessException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	
    @Override
	public void deleteProduct(product PID)
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nadaproduct", "root", "");
                        String query = "DELETE FROM product1 WHERE PID=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, PID.getPID());
                        
			int rowsUpdated = psmt.executeUpdate();
			if (rowsUpdated == 0) {
				JOptionPane.showMessageDialog(null, "User does not exist");
			} else {
				JOptionPane.showMessageDialog(null, "User deleted");
			}
			
			}
		 catch (ClassNotFoundException | SQLException | HeadlessException e)
		 {
			 JOptionPane.showMessageDialog(null, e); 
		 }
		 }
        
        
        public void updateProduct(product product)
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nadaproduct", "root", "");
			PreparedStatement psmt = conn.prepareStatement("UPDATE product1 SET   PDate=?,EDate=?Type=?,Manufacturer=? WHERE PID=?");
	
			psmt.setString(1, product.getPID());
			
			psmt.setString(2, product.getPDate());
			psmt.setString(3, product.getEDate());
                        psmt.setString(4, product.getType());
			psmt.setString(5, product.getManufacturer());
                        int rowsUpdated = psmt.executeUpdate();
			if (rowsUpdated == 0) {
				JOptionPane.showMessageDialog(null, "Update done");
			} else {
				JOptionPane.showMessageDialog(null, "EMPTY");
			}
                        }
			catch (ClassNotFoundException | SQLException | HeadlessException e)
			 {
				 JOptionPane.showMessageDialog(null, e); 
			 }
			
			

	}
        
        public ArrayList<product> GetAllproducts(product product)
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nadaproduct", "root", "");
                        
                     String query ="SELECT * FROM product1 WHERE Manufacturer = ' " +product.getManufacturer()+ " ' " ;;
                     //PreparedStatement psmt = conn.prepareStatement(query);

                    // create the java statement
                    Statement st = conn.createStatement();
      
                    // execute the query, and get a java resultset
                    ResultSet rs = st.executeQuery(query);
      
                    // iterate through the java resultset
                        while (rs.next())
                  {  
                      
                    int numColumns = rs.getMetaData().getColumnCount();
            for ( int i = 1 ; i <= numColumns ; i++ ) {
                    
                   String PID= (rs.getString("PID"));
                    String PDate = rs.getString("PDate");
                    String EDate = rs.getString("EDate");
                    String Type = rs.getString("Type");
                    String Manufacturer = rs.getString("Manufacturer");
                   
                      
                   

                     //Display values
                    System.out.print("PID: "+ i + " = " + PID);
                    System.out.print(", ProductionDate: "+ i + " = " + PDate);
                    System.out.println(", ExpiryDate: " + i + " = "+ EDate);
                   
                    System.out.print(", Type: " + i + " = "+ Type);
                    System.out.print(", Manufacturer: "+ i + " = " + Manufacturer);
                    
            }      
                 
                }
                       
                        st.close();
                }
			catch (ClassNotFoundException | SQLException | HeadlessException e)
			 {
				 JOptionPane.showMessageDialog(null, e); 
			 }
                
			
                }
    
    
    
    
    
    
}
