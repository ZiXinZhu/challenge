package com.zzx.insert.design.module_factory;

import com.zzx.insert.design.module_factory.factorys.AbstractFactory;
import com.zzx.insert.design.module_factory.factorys.CarFactory;
import com.zzx.insert.design.module_factory.service.BaoMaCar;
import com.zzx.insert.design.module_factory.service.BenChiCar;
import com.zzx.insert.design.module_factory.service.BenChiCar_X21;

public class DoFactory {

    public static void main(String[] args) {
        AbstractFactory factory=new CarFactory();
        BaoMaCar bmcar=factory.perduce(BaoMaCar.class);
        bmcar.run();
        bmcar.stop();
        BenChiCar bccar=factory.perduce(BenChiCar.class);
        bccar.run();
        bccar.stop();

        BenChiCar_X21 benChiCar_x21=factory.perduce(BenChiCar_X21.class);
        benChiCar_x21.open();
        benChiCar_x21.run();
        benChiCar_x21.stop();

    }
}
