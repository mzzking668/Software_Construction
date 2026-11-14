package edu.hitwh.factory_model.NvWaExample;

import edu.hitwh.factory_model.NvWaExample.HumanModel.Human;
import edu.hitwh.factory_model.NvWaExample.HumanModel.Woman;

public class YinRope implements Rope {
    @Override
    public Human createHuman() {
        return new Woman();
    }
}
