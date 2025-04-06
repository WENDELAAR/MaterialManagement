
package com.r217887l.rawmaterialmanagement.Service;

import com.r217887l.rawmaterialmanagement.Model.Materials;
import com.r217887l.rawmaterialmanagement.Repo.MaterialsRepository;

public class MaterialService {
    
    MaterialsRepository materialrepo = new MaterialsRepository();
    
    public void saveMaterial(Materials material){
    
        materialrepo.saveMaterials(material);
    
    }
    
}
