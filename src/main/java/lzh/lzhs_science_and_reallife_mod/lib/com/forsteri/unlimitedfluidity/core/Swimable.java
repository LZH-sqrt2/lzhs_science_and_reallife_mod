package lzh.lzhs_science_and_reallife_mod.lib.com.forsteri.unlimitedfluidity.core;


/**
 * @since       1.0    （加入该类时程序的版本号）
 *
 * If implements this player can swim in here
 */
public interface Swimable {
    default boolean canSwim(){return true;}
}
