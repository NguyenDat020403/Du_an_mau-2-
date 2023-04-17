/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.SoCD;
import Responsitories.CDResponsitory;
import Responsitoriesimpl.CD_responsitory_impl;
import Services.CDService;
import View_Model.CDViewModel;
import java.util.List;

/**
 *
 * @author admin
 */
public class CD_Service_impl implements CDService{
    CDResponsitory CDRes = new CD_responsitory_impl();

    @Override
    public List<CDViewModel> getALL() {
        return CDRes.getALL();
    }

    @Override
    public int creat(SoCD n) {
        return CDRes.creat(n);
    }

    @Override
    public int update(SoCD n, String SoCD) {
        return CDRes.update(n, SoCD);
    }

    @Override
    public int delete(String SoCD) {
        return CDRes.delete(SoCD);
    }

    @Override
    public SoCD getOne(String SoCD) {
            return CDRes.getOne(SoCD);

    }    
}
