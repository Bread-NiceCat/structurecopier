package cn.breadnicecat.candycraftce.misc;

import cn.breadnicecat.candycraftce.utils.CLogUtils;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.level.GameRules;
import org.slf4j.Logger;

/**
 * Created in 2023/12/31 10:48
 * Project: candycraftce
 *
 * @author <a href="https://github.com/BreadNiceCat">Bread_NiceCat</a>
 * <p>
 */
public class CGameRules {

	private static final Logger LOGGER = CLogUtils.sign();
	public static final GameRules.Key<GameRules.BooleanValue> CARAMEL_PORTAL_WORKS = register("doCaramelPortalWorks", GameRules.Category.UPDATES, GameRules.BooleanValue.create(true));

	public static void init() {
		LOGGER.info("init");
	}

	@ExpectPlatform
	public static <T extends GameRules.Value<T>> GameRules.Key<T> register(String name, GameRules.Category category, GameRules.Type<T> type) {
		throw new AssertionError();
	}
}
