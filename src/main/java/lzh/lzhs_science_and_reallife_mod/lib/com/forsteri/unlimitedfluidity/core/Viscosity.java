package lzh.lzhs_science_and_reallife_mod.lib.com.forsteri.unlimitedfluidity.core;

public interface Viscosity {
    /**
     * @since       1.0    （加入该类时程序的版本号）
     * For Custom fluid that have entity movement viscosity.
     * return value is how much slower the entity move in this fluid compare to water.
     */
    int getViscosity();
}
