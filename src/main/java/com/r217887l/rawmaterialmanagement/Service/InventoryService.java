package com.r217887l.rawmaterialmanagement.Service;

import com.r217887l.rawmaterialmanagement.Model.Inventory;
import com.r217887l.rawmaterialmanagement.Model.categories;
import com.r217887l.rawmaterialmanagement.Repo.InventoryRepository;

public class InventoryService {
    
InventoryRepository inventoryRepository = new InventoryRepository();

public void saveInventory(Inventory inventory){
    
    inventoryRepository.saveInventory(inventory);

}
public void updateInv(Inventory inv){

    inventoryRepository.updateInventory(inv);
}
 public void deleteInventory(Inventory inv){

    inventoryRepository.deleteInventory(inv);
}
   
}
