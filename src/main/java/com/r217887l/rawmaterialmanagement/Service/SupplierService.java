package com.r217887l.rawmaterialmanagement.Service;

import com.r217887l.rawmaterialmanagement.Model.SupplierDetails;
import com.r217887l.rawmaterialmanagement.Repo.SupplierDetailsRepository;
import java.util.List;

public class SupplierService {

    SupplierDetailsRepository sdr = new SupplierDetailsRepository();
    
    public void saveSupplierDetailsRepo(SupplierDetails supplierDetails){
        
        sdr.saveSupplier(supplierDetails);
    }
  
    public void updateSupplierDetailsRepo(SupplierDetails supplierDetails,int id){
        
        sdr.updateSupplier(supplierDetails,id);
    }
    
    public void deleteSupplierDetailsRepo(int id){
        
        sdr.deleteSupplier(id);
    }
    
    public List<SupplierDetails> findAllSuppliers(SupplierDetails supplierDetails){
        
        return sdr.findAllSuppliers(supplierDetails);
        
    }
    
}
