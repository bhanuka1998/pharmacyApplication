package com.assignment.leePharmacy.pharmacyApplication.control;

import com.assignment.leePharmacy.pharmacyApplication.model.Rack;
import com.assignment.leePharmacy.pharmacyApplication.service.RackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RackController {

    @Autowired
    private RackService rackService;

    @RequestMapping(method = RequestMethod.POST, value = "/saveRack")
    public void saveRack(@RequestBody Rack rack){
        rackService.saveRack(rack);
    }

    @RequestMapping("getAllRacks")
    public List<Rack> getAllRacks(){
        return rackService.getAllRacks();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateRack/{id}")
    public void updateRack(@PathVariable Integer id, @RequestBody Rack rack){
        rackService.updateRack(id, rack);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteRack/{id}")
    public void deleteRack(@PathVariable Integer id){
        rackService.deleteRack(id);
    }
}
