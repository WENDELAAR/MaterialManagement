
package com.r217887l.rawmaterialmanagement.Service;

import com.r217887l.rawmaterialmanagement.Model.Materials;
import com.r217887l.rawmaterialmanagement.Repo.MaterialsRepository;
import java.util.List;

public class MaterialService {
    
    MaterialsRepository materialrepo = new MaterialsRepository();
    
    public void saveMaterial(Materials material){
    
        materialrepo.saveMaterials(material);
    
    }
    public void updateMaterail(Materials materials){

    materialrepo.updateMaterial(materials);
}
    public void deleteMaterail(Materials materials){

    materialrepo.deleteMaterial(materials);
}
    public List<Materials> findAllMaterials(Materials materials)
    {
        return materialrepo.findAllMaterials(materials);
    }
    
}
