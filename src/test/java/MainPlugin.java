import com.LullBukkitAPI.xBuhari.LBAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class MainPlugin extends JavaPlugin {

    private MainPlugin mainPlugin;

    public LBAPI lbAPI;

    @Override
    public void onEnable() {
        this.mainPlugin = this;
        this.lbAPI = new LBAPI(this.mainPlugin);

        this.getLogger().info("TPS: " + lbAPI.getServerAPI().getServerTPS());
    }

    public MainPlugin getMainPlugin() {
        return mainPlugin;
    }
}
