package com.jimdoesnotgym.tutorial.items;

import com.jimdoesnotgym.tutorial.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ms076 on 2017-01-20.
 */
//final class cannot be subclassed
public final class ModItems {

    //initialize our item
    public static Item tutorialItem;

    public static void preInit(){
        tutorialItem = new Item().setUnlocalizedName("tutorial_item").setCreativeTab(Main.tabTutorial);

        registerItems();
    }

    //static method so can be invoked even without an instance of the class
    //this is where we register our custom item
    public static void registerItems(){
        GameRegistry.register(tutorialItem, new ResourceLocation(Main.MODID, "tutorial_item"));
    }

    public static void registerRenders(){
        //this method just calls the method below
        registerRender(tutorialItem);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item, 0, new ModelResourceLocation(
                        Main.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
