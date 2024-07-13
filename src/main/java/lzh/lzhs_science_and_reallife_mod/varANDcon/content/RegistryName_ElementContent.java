package lzh.lzhs_science_and_reallife_mod.varANDcon.content;

import lzh.lzhs_science_and_reallife_mod.api.DataType.ElementContent;

import java.util.HashMap;

public class RegistryName_ElementContent {
    public static final ElementContent RegName_EleCon = new ElementContent();

    HashMap<String, Double> testCon = new HashMap<String, Double>();

    public void RegistryName_ElementContent() {
        testCon.put("copper", 0.02);
        RegName_EleCon.add("test", testCon);
    }
}
