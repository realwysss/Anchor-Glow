package dev.angl;

import java.util.Map;
import net.minecraft.core.BlockPos;

public class Em {
	public static void gather() {
		for (Map.Entry<Long, Integer> e : Anc.map.entrySet()) {
			int c = e.getValue();
			if (c == 0 && !Cfg.c.emp) continue;
			float k = c == 0 ? 0.25f : Cfg.c.chg ? 0.4f + 0.6f * c / 4f : 1f;
			long l = e.getKey();
			Gk.add(BlockPos.getX(l) + 0.5, BlockPos.getY(l) + 0.5, BlockPos.getZ(l) + 0.5, 2.8f, Cfg.c.col, k, (int) l);
		}
	}
}
