package edu.hitwh.factory_model.NvWaExample;

import edu.hitwh.factory_model.NvWaExample.HumanModel.Human;
import edu.hitwh.factory_model.NvWaExample.HumanModel.Man;

public class YangRope implements Rope {
    public Human createHuman() {
        return new Man();
    }
}
