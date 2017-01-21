package com.jimdoesnotgym.tutorial;

import com.jimdoesnotgym.tutorial.items.ModItems;
import com.jimdoesnotgym.tutorial.tab.CreativeTabTutorial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ms076 on 2017-01-17.
 */

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main{

    public static final String MODID = "tutorial";
    public static final String MODNAME = "Tutorial Mod";
    public static final String VERSION = "1.10.0";

    @SidedProxy(clientSide="com.jimdoesnotgym.tutorial.ClientProxy", serverSide="com.jimdoesnotgym.tutorial.ServerProxy")
    public static CommonProxy proxy;

    @Instance
    public static Main instance = new Main();

    public static CreativeTabTutorial tabTutorial;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        tabTutorial = new CreativeTabTutorial(CreativeTabs.getNextID(), "tab_tutorial");
        proxy.preInit(e);
        ModItems.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
