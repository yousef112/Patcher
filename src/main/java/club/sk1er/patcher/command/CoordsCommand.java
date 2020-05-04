package club.sk1er.patcher.command;

import club.sk1er.patcher.util.chat.ChatUtilities;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class CoordsCommand extends CommandBase {
    /**
     * Gets the name of the command
     */
    @Override
    public String getCommandName() {
        return "coords";
    }

    /**
     * Gets the usage string for the command.
     *
     * @param sender
     */
    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/coords";
    }

    /**
     * Callback when the command is invoked
     *
     * @param sender
     * @param args
     */
    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        if (args.length != 0) {
            ChatUtilities.sendMessage("Too many arguments. Usage: " + getCommandUsage(sender));
        } else {
            EntityPlayerSP player = Minecraft.getMinecraft().thePlayer;
            player.sendChatMessage("x: " + (int) player.posX + ", y: " + (int) player.posY + ", z: " + (int) player.posZ);
        }
    }

    @Override
    public int getRequiredPermissionLevel() {
        return -1;
    }
}