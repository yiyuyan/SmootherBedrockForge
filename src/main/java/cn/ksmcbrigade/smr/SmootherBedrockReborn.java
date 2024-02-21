package cn.ksmcbrigade.smr;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("smr")
public class SmootherBedrockReborn {

    public SmootherBedrockReborn() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
