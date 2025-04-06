package com.r217887l.rawmaterialmanagement.Service;

import com.r217887l.rawmaterialmanagement.Model.SupplierDetails;
import com.r217887l.rawmaterialmanagement.Repo.SupplierDetailsRepository;

public class SupplierService {

    SupplierDetailsRepository sdr = new SupplierDetailsRepository();
    
    public void saveSupplierDetailsRepo(SupplierDetails supplierDetails){
        
        sdr.saveSupplier(supplierDetails);
    }
    
}
