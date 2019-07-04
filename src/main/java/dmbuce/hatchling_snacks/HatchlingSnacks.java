
package dmbuce.hatchling_snacks;

import dmbuce.hatchling_snacks.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import org.apache.logging.log4j.Logger;

import static dmbuce.hatchling_snacks.HatchlingSnacks.*;

@Mod(modid = MODID, name = MODNAME, version = MODVERSION, dependencies = "required-after:forge@[14.23.5.2838,)", useMetadata = true)
public class HatchlingSnacks {

	public static final String MODID = "hatchling-snacks";
	public static final String MODNAME = "Hatchling Snacks";
	public static final String MODVERSION= "0.0.1";

	@SidedProxy(clientSide = "dmbuce.hatchling_snacks.proxy.ClientProxy", serverSide = "dmbuce.hatchling_snacks.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Mod.Instance
	public static HatchlingSnacks instance;

	public static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}

