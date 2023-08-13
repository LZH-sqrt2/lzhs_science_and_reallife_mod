package lzh.lzhs_science_and_reallife_mod.api.DataType;

import java.util.ArrayList;
import java.util.HashMap;

public class ElementContent {
    private static HashMap<String, HashMap> RegistryName_ElementContent_Map = new HashMap<String, HashMap>();

    public static HashMap add(String RegName, HashMap EleConMap) {
        //ElementNameList
        ArrayList<String> EleNameList = new ArrayList<String>();
        EleNameList.add("hydrogen");
        EleNameList.add("helium");
        EleNameList.add("lithium");
        EleNameList.add("beryllium");
        EleNameList.add("Boron");
        EleNameList.add("Carbon");
        EleNameList.add("Nitrogen");
        EleNameList.add("Oxygen");
        EleNameList.add("Fluorine");
        EleNameList.add("Neon");
        EleNameList.add("Sodium");
        EleNameList.add("Sodium");
        EleNameList.add("Aluminum");
        EleNameList.add("iron");
        EleNameList.add("gold");

        //检测是否包含所有元素，若不包含，则加上一个other，other=-1.0f（不包含）
        for (int i = 0; i < 4; i++) {
            if(!RegistryName_ElementContent_Map.equals(EleNameList.get(i))) {
                HashMap<String, Double> other = new HashMap<String, Double>();
                double other_double = -1.0;
                other.put("other", other_double);
                RegistryName_ElementContent_Map.put("other", other);
            }
        }
        RegistryName_ElementContent_Map.put(RegName, EleConMap);
        return RegistryName_ElementContent_Map;
    }

    //移除
    //pass
}
